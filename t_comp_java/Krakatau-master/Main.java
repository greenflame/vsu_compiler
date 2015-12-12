public class Main {

    public static void main(String[] args) {
        
        Test test = new Test();
        
        System.out.printf("Hello, world! [%d]\n", test.run());
    }
}

class Test {   
    public int a;
    public int b;
    public int c;
    
    Test()
    {
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }
    
    public int run()
    {
        a = 4;
        b = 8;
        c = a + b;
        return c;
    }
}