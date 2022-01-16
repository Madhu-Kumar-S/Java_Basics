package Methods;
class Person
{
    private String name;
    private int age;
    void get_data(String name, int age)
    {
        this.name=name;
        this.age=age;
    }
    void display()
    {
        System.out.println("Name is = "+name+"\nAge is = "+age);
    }
}

public class M8 {
    public static void main(String[] args)
    {
        Person p = new Person();
        p.get_data("Alex",21);
        p.display();
    }
}
