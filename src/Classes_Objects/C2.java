package Classes_Objects;

class Person
{
    String name = "A";
    int no = 1;
    void show()
    {
        System.out.println("Name: "+name);
        System.out.println("No: "+no);
    }
}

public class C2 {
    public static void main(String[] args)
    {
        Person p = new Person();
        // these variable will overwrite the Person class variables
        p.name = "B";
        p.no = 2;
        p.show();
    }
}
