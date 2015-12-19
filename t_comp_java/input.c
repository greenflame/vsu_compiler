void inc(int n)
{
	q = q + 1;
	if (n - 1 > 0)
	{
		inc(n - 1);
	}
	return;
}

int q = 0;

for (int i = 0; i < 10; i = i + 1)
{
	inc(3);
    q = q + 1;
}

write(q);
return;


// ---------------------
// void f1(int g, int f)
// {
// 	write(g + f);
// 	return;
// }

// void f2()
// {
// 	void f3()
// 	{
// 		void f4()
// 		{
// 			f1(3, 4);
// 			return;
// 		}
// 		f4();
// 		return;
// 	}
// 	f3();
// 	return;
// }

// f2();
// return;
// ---------------------

// read(a, b);
// int c = a + b;
// write(c);

// int main(int b, string q, int w)
// {
// 	int r, j, k;
	
// 	void toSth(int a)
// 	{
// 		string h;
// 		int t;
// 	}

// 	void abc(int b, int c)
// 	{
// 		string r, y, u;
// 		int t;
// 	}
// }

// a = b + c;

/*
int a = 3;
bool res;
if (a > 2)
{
	res = true;
}

q = 12;

qwe(12, a);

int a = 67 - 2, c, d = 1;

for (int a, b = 3; i < 1; j = d * 3)
{
	write(df);
}

if (a < b)
{
	write("hello");
}
else
{
	read(q);
}

void testfunc(int a, string b, void c)
{
	for(int i = 0; i < 10; i = i + 1)
		write("hello" + i);

	string strconcat(string a, string b)
	{
		return a + b;
	}

	string tmp = strconcat("hello, ", b);

	return;
}
*/
