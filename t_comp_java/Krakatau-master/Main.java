public class Main {

    public static void main(String[] args) {

        System.out.println("Hello, world!");
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
    
    public int run(int e)
    {
        int d = 4;
        a = e;
        b = 8;
        c = a + b;
        return c;
    }
}