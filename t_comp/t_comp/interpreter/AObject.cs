﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace t_comp.interpreter
{
    abstract class AObject
    {
        public virtual AObject Add(AObject other) { throw new Exception("operation is not allowed"); }
        public virtual AObject Sub(AObject other) { throw new Exception("operation is not allowed"); }
        public virtual AObject Mul(AObject other) { throw new Exception("operation is not allowed"); }
        public virtual AObject Div(AObject other) { throw new Exception("operation is not allowed"); }

        public virtual AObject Ladd(AObject other) { throw new Exception("operation is not allowed"); }
        public virtual AObject Lmul(AObject other) { throw new Exception("operation is not allowed"); }

        public virtual AObject Lt(AObject other) { throw new Exception("operation is not allowed"); }
        public virtual AObject Gt(AObject other) { throw new Exception("operation is not allowed"); }
        public virtual AObject Le(AObject other) { throw new Exception("operation is not allowed"); }
        public virtual AObject Ge(AObject other) { throw new Exception("operation is not allowed"); }

        public virtual AObject Eq(AObject other) { throw new Exception("operation is not allowed"); }
        public virtual AObject Neq(AObject other) { throw new Exception("operation is not allowed"); }
    }
}
