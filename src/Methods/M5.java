package Methods;

// static members can access only static content
class M55
{
    static int x;
    M55(int x)
    {
       M55.x =x;
    }
    static void show()
    {
        System.out.println("value is: "+x);
    }
}

public class M5 {
    public static void main(String[] args)
    {
        M55 m = new M55(56);
        M55.show();
    }
}
