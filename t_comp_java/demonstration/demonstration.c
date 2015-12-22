int fcall = 0;
int summcall = 0;
int nn = 0;

int f(int n)
{
    fcall = fcall + 1;
    
    int q = 0;
    
    int sum(int n)
    {
        int nnn, res2;
        summcall = summcall + 1;
        
        void proc(int m)
        {
            q = m;
            return;
        }
        
        int res = 0;
        nn = f(n);
        for(int i = 1; i <= nn; i = i + 1)
        {
            res = res + i;
            proc(q + 1);
        }        
        
        res2 = 0;
        nnn = f(n);
        for(i = 1; i <= nnn; i = i + 1)
        {
            res2 = res2 + i;
            proc(q + 1);
        }
        return res + res2;
    }

    if (n == 1)
    {
        return 1;
    }
    
    return sum(n - 1) + q;
}

write("hello", f(5), fcall, summcall);

return;
