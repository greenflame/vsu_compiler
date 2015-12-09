public class Main {

    public static void main(String[] args) {
        
        Test test = new Test();
        
        System.out.printf("Hello, world! [%d]\n", test.run());
    }
}

class Test {
    
    Test()
    {
        
    }
    
    Test(int a, int b, int c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public int a;
    public int b;
    public int c;
    
    public int run()
    {
        a = 4;
        b = 8;
        c = a + b;
        return c;
    }
}