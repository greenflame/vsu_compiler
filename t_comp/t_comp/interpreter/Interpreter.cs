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
                throw new Exception("Node is not a program.");
            }

            Block(node);
        }

        public void Block(ITree node)
        {
            for (int i = 0; i < node.ChildCount; i++)
            {
                Execute(node.GetChild(i));
            }
        }

        public void VarDeclaration(ITree typeNode, ITree nameNode)
        {
            AObject var;

            switch (typeNode.Type)
            {
                case cLexer.INT_TYPE:
                    var = new AInteger();
                    break;

                case cLexer.BOOL_TYPE:
                    var = new ABoolean();
                    break;

                case cLexer.STRING_TYPE:
                    var = new AString();
                    break;

                default:
                    throw new Exception("Unexpected declaration type.");
            }

            string varName = nameNode.ToString();

            _varStorage[varName] = var;
        }

        public void VarsDeclaration(ITree node)
        {
            ITree var_type = node.GetChild(0).GetChild(0);
            ITree notInitedVars = node.GetChild(1);
            ITree initedVars = node.GetChild(2);

            // List of vars without assignmeng
            for (int i = 0; i < notInitedVars.ChildCount; i++)
            {
                ITree var_name = notInitedVars.GetChild(i);
                VarDeclaration(var_type, var_name);
            }

            // Declaration and assignment
            for (int i = 0; i < initedVars.ChildCount; i++)
            {
                // Declaration
                ITree var_name = initedVars.GetChild(i).GetChild(0);
                VarDeclaration(var_type, var_name);

                // Assignment
                Assign(initedVars.GetChild(i));
            }
        }

        public void Assign(ITree node)
        {
            string var_name = node.GetChild(0).ToString();
            ITree node_to_solve = node.GetChild(1);

            _varStorage[var_name].Assign(Solve(node_to_solve));
        }

        public void If(ITree node)
        {
            if ((Solve(node.GetChild(0).GetChild(0)) as ABoolean).Value)
            {
                Execute(node.GetChild(1).GetChild(0));
            }
            else
            {
                if (node.GetChild(2).ChildCount != 0)
                {
                    Execute(node.GetChild(2).GetChild(0));
                }
            }
        }

        public void Execute(ITree node)
        {
            switch (node.Type)
            {
                case cLexer.ASSIGN:
                    Assign(node);
                    break;

                case cLexer.VAR_DEC:
                    VarsDeclaration(node);
                    break;

                // todo funccall

                // todo read
                // todo write

                // todo func_declaration

                // todo return

                case cLexer.BLOCK:
                    Block(node);
                    break;

                case cLexer.IF:
                    If(node);
                    break;

                // todo for_construction

                default:
                    throw new Exception("Non executable node.");
            }
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
                // todo func call on lower level

                case cLexer.NUMBER: return new AInteger(int.Parse(node.ToString()));
                case cLexer.STRING: return new AString(node.ToString());
                case cLexer.LOGIC: return new ABoolean(bool.Parse(node.ToString()));

                default:
                    throw new Exception("Can't solve node.");
            }
        }

    }
}
