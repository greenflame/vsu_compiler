using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace t_comp.interpreter
{
    class AString : AObject
    {
        public string Value { get; private set; }

        public AString(string value)
        {
            Value = value;
        }

        public AString()
        {
            Value = "";
        }

        public override string ToString()
        {
            return Value;
        }

        public override void Assign(AObject other)
        {
            if (other is AString)
            {
                Value = (other as AString).Value;
            }
            else
            {
                throw new InvalidTypeException();
            }
        }

        public override AObject Add(AObject other)
        {
            if (other is AString)
            {
                return new AString(Value + (other as AString).Value);
            }

            if (other is AInteger)
            {
                return new AString(Value + (other as AInteger).Value.ToString());
            }

            return base.Add(other);
        }

        public override AObject Eq(AObject other)
        {
            if (other is AString)
            {
                return new ABoolean(Value == (other as AString).Value);
            }

            return base.Eq(other);
        }

        public override AObject Neq(AObject other)
        {
            if (other is AString)
            {
                return new ABoolean(Value != (other as AString).Value);
            }

            return base.Neq(other);
        }
    }
}
