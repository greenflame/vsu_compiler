public class Main {

    public static void main(String[] args) {
        int a = 2, b = 3, c = 8;
        if (a != b) {
            System.out.println("Hello!");
        } else {
            System.out.println("Goodby!");            
            int q = 4;
        }
        System.out.println("Later!");        
    }
}

class Test {   
    public int a;
    public int b;
    public int c;
    
    public Test parent;
    
    Test(Test p)
    {
        parent = p;
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
        c = a - b;
        c = a * b;
        c = a / b;
        
        return c;
    }
}