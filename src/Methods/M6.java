package Methods;

class Test1
{
    int x = 10;  // instance variable
    void show()
    {
        System.out.println("x = "+x);
    }

}

class Test2
{
    static int x = 10;  // static or class variable
    static void show()
    {
        System.out.println("x = "+x);
    }

}


public class M6 {
    public static void main(String[] args)
    {
        Test1 o1,o2;
        o1=new Test1();
        o2=new Test1();
        o1.x++;
        o1.show();
        o2.show();

        Test2 t1,t2;
        t1=new Test2();
        t2=new Test2();
        Test2.x++;
        t1.show();
        t2.show();
    }
}
