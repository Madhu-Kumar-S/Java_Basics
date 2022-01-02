package Classes_Objects;

class Person3
{
    private String name = "p3";
    void show()
    {
        System.out.println("Name is: "+name);
    }
}
public class C3 {
    public static void main(String[] args)
    {
        Person3 p3 = new Person3();
        p3.show();
        Person3 p4 = new Person3();
        p4.show();
    }
}
