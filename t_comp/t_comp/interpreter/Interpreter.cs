using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Antlr.Runtime;
using Antlr.Runtime.Tree;

namespace t_comp.interpreter
{
    class Interpreter
    {
        private Dictionary<string, AObject> _varStorage;

        public Interpreter()
        {
            _varStorage = new Dictionary<string, AObject>();
        }

        public void Program(ITree node)
        {
            if (node.Type != cLexer.PROGRAM)
            {
                throw new Exception("tree is not a program");
            }

            Expr(node.GetChild(0));
        }

        public void Expr(ITree node)
        {
            for (int i = 0; i < node.ChildCount; i++)
            {
                ITree child = node.GetChild(i);
                switch (child.Type)
                {
                    case cLexer.READ:
                        Read(child);
                        break;
                    case cLexer.WRITE:
                        Write(child);
                        break;
                    case cLexer.ASSIGN:
                        Assign(child);
                        break;
                    case cLexer.BLOCK:
                        Expr(child);
                        break;
                    case cLexer.IF:
                        If(child);
                        break;
                    case cLexer.FOR:
                        For(child);
                        break;
                }
            }
        }

        private void For(ITree node)
        {
            for (Expr(node.GetChild(0)); (Solve(node.GetChild(1)) as ABoolean).Value; Expr(node.GetChild(2)))
            {
                Expr(node.GetChild(3));
            }
        }

        private void If(ITree node)
        {
            if ((Solve(node.GetChild(0)) as ABoolean).Value)
            {
                Expr(node.GetChild(1));
            }
            else
            {
                if (node.ChildCount == 3)
                {
                    Expr(node.GetChild(2));
                }
            }
        }

        private void Read(ITree node)
        {
            for (int i = 0; i < node.ChildCount; i++)
            {
                ITree child = node.GetChild(i);

                string val = Console.ReadLine();
                AObject objVal;

                switch (TypeOf(val))
                {
                    case "string":
                        objVal = new AString(val);
                        break;
                    case "integer":
                        objVal = new AInteger(int.Parse(val));
                        break;
                    case "boolean":
                        objVal = new ABoolean(bool.Parse(val));
                        break;
                    default:
                        throw new Exception("can't detect type");
                }

                _varStorage[child.ToString()] = objVal;
            }
        }

        private void Write(ITree node)
        {
            for (int i = 0; i < node.ChildCount; i++)
            {
                ITree child = node.GetChild(i);
                Console.WriteLine(Solve(child));
            }
        }

        private void Assign(ITree node)
        {
            string varName = node.GetChild(0).ToString();
            AObject value = Solve(node.GetChild(1));

            _varStorage[varName] = value;
        }

        private AObject Solve(ITree node)
        {
            switch (node.Type)
            {
                case cLexer.ADD: return Solve(node.GetChild(0)).Add(Solve(node.GetChild(1)));
                case cLexer.SUB: return Solve(node.GetChild(0)).Sub(Solve(node.GetChild(1)));
                case cLexer.MUL: return Solve(node.GetChild(0)).Mul(Solve(node.GetChild(1)));
                case cLexer.DIV: return Solve(node.GetChild(0)).Div(Solve(node.GetChild(1)));

                case cLexer.LADD: return Solve(node.GetChild(0)).Ladd(Solve(node.GetChild(1)));
                case cLexer.LMUL: return Solve(node.GetChild(0)).Lmul(Solve(node.GetChild(1)));

                case cLexer.GE: return Solve(node.GetChild(0)).Ge(Solve(node.GetChild(1)));
                case cLexer.LE: return Solve(node.GetChild(0)).Le(Solve(node.GetChild(1)));
                case cLexer.GT: return Solve(node.GetChild(0)).Gt(Solve(node.GetChild(1)));
                case cLexer.LT: return Solve(node.GetChild(0)).Lt(Solve(node.GetChild(1)));

                case cLexer.NEQUALS: return Solve(node.GetChild(0)).Neq(Solve(node.GetChild(1)));
                case cLexer.EQUALS: return Solve(node.GetChild(0)).Eq(Solve(node.GetChild(1)));

                case cLexer.ID: return _varStorage[node.ToString()];

                case cLexer.NUMBER: return new AInteger(int.Parse(node.ToString()));
                case cLexer.STRING: return new AString(node.ToString());
                case cLexer.LOGIC: return new ABoolean(bool.Parse(node.ToString()));

                default:
                    throw new Exception("unexpected node type");
            }
        }

        string TypeOf(string s)
        {
            if (s.Length == 0)
            {
                throw new Exception("var val length is 0");
            }

            if (s.ToLower() == "true" || s.ToLower() == "false")
            {
                return "boolean";
            }

            if (s[0] == '"')
            {
                return "string";
            }

            if (s[0] >= '0' && s[0] <= '9')
            {
                return "integer";
            }

            throw new Exception("type detection error");
        }
    }
}
