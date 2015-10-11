using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace t_comp.interpreter
{
    class ABoolean : AObject
    {
        public bool Value { get; private set; }

        public ABoolean(bool value)
        {
            Value = value;
        }

        public override string ToString()
        {
            return Value.ToString();
        }

        public override AObject Eq(AObject other)
        {
            if (other is ABoolean)
            {
                return new ABoolean(Value == (other as ABoolean).Value);
            }

            return base.Eq(other);
        }

        public override AObject Neq(AObject other)
        {
            if (other is ABoolean)
            {
                return new ABoolean(Value != (other as ABoolean).Value);
            }

            return base.Neq(other);
        }

        public override AObject Ladd(AObject other)
        {
            if (other is ABoolean)
            {
                return new ABoolean(Value || (other as ABoolean).Value);
            }

            return base.Ladd(other);
        }

        public override AObject Lmul(AObject other)
        {
            if (other is ABoolean)
            {
                return new ABoolean(Value && (other as ABoolean).Value);
            }

            return base.Lmul(other);
        }
    }
}
