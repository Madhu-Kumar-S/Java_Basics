package Classes_Objects;

class Person4
{
    private final String name;
    private final int age;
    // default Constructor
    Person4()
    {
        name = "Raju";
        age = 21;
    }
    // parameterized constructor
    Person4(String s,int i)
    {
        name = s;
        age = i;
    }
    void show()
    {
        System.out.println("name = "+name);
        System.out.println("age = "+age);
    }

}

public class C4 {
    public static void main(String[] args)
    {
        Person4 Raju = new Person4();
        Raju.show();
        Person4 Sita = new Person4("Sita", 22);
        Sita.show();
    }
}
