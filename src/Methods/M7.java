package Methods;

class M77
{
    private int x; // instance variable
    void getData(int x)
    {
        this.x = x; // local variable
    }
    void show()
    {
        System.out.println("Value of x = "+x);
    }
}

public class M7 {
    public static void main(String[] args)
    {
        M77 m = new M77();
        m.getData(50);
        m.show();
    }
}
