using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace t_comp.interpreter
{
    class AInteger : AObject
    {
        public int Value { get; private set; }

        public AInteger(int value)
        {
            Value = value;
        }

        public override string ToString()
        {
            return Value.ToString();
        }

        public override AObject Add(AObject other)
        {
            if (other is AInteger)
            {
                return new AInteger(Value + (other as AInteger).Value);
            }

            return base.Add(other);
        }

        public override AObject Sub(AObject other)
        {
            if (other is AInteger)
            {
                return new AInteger(Value - (other as AInteger).Value);
            }

            return base.Sub(other);
        }

        public override AObject Mul(AObject other)
        {
            if (other is AInteger)
            {
                return new AInteger(Value * (other as AInteger).Value);
            }

            return base.Mul(other);
        }

        public override AObject Div(AObject other)
        {
            if (other is AInteger)
            {
                return new AInteger(Value / (other as AInteger).Value);
            }

            return base.Div(other);
        }

        public override AObject Eq(AObject other)
        {
            if (other is AInteger)
            {
                return new ABoolean(Value == (other as AInteger).Value);
            }

            return base.Eq(other);
        }

        public override AObject Neq(AObject other)
        {
            if (other is AInteger)
            {
                return new ABoolean(Value != (other as AInteger).Value);
            }

            return base.Neq(other);
        }

        public override AObject Lt(AObject other)
        {
            if (other is AInteger)
            {
                return new ABoolean(Value < (other as AInteger).Value);
            }

            return base.Lt(other);
        }

        public override AObject Gt(AObject other)
        {
            if (other is AInteger)
            {
                return new ABoolean(Value > (other as AInteger).Value);
            }

            return base.Gt(other);
        }

        public override AObject Le(AObject other)
        {
            if (other is AInteger)
            {
                return new ABoolean(Value <= (other as AInteger).Value);
            }

            return base.Le(other);
        }

        public override AObject Ge(AObject other)
        {
            if (other is AInteger)
            {
                return new ABoolean(Value >= (other as AInteger).Value);
            }

            return base.Ge(other);
        }
    }
}
