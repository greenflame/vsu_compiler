using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Antlr.Runtime;
using Antlr.Runtime.Tree;
using t_comp.interpreter;

namespace t_comp
{
    class Program
    {
        static void Main(string[] args)
        {
            ANTLRFileStream fs = new ANTLRFileStream("input.txt");
            cLexer lxr = new cLexer(fs);
            CommonTokenStream cts = new CommonTokenStream(lxr);
            cParser psr = new cParser(cts);
            ITree tree = (ITree)psr.execute().Tree;

            AstNodePrinter.Print(tree);

            Interpreter interpreter = new Interpreter();
            interpreter.Program(tree);

            Console.ReadKey();
        }
    }
}
