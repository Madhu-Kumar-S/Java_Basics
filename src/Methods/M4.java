package Methods;

// pgm on static methods

class M44
{
    static String show()
    {
        return "Static content outside main class";
    }
}

public class M4 {
    public static void main(String[] args)
    {
        M4.m4();
        System.out.println("......................................");
        System.out.println(M44.show());
    }

    static void m4()
    {
        System.out.println("Static content inside main class");
    }
}
