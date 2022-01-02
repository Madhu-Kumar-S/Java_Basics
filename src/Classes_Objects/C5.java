package Classes_Objects;
class Person5
{
    private final String name;
    private final int age;
    Person5(String s, int i)
    {
        name = s;
        age = i;
    }

    void display()
    {
        if(age>=1 && age<=4) System.out.println(name+" is child");
        else if(age>4 && age<18) System.out.println(name+" is Young");
        else if(age>=18 && age<=24) System.out.println(name+" is adult");
        else if(age>=25 && age<=50) System.out.println(name+" middle aged");
        else if(age>50) System.out.println(name+" old aged");
    }
}

public class C5 {
    public static void main(String[] args)
    {
        Person5 p5 = new Person5(args[0],Integer.parseInt(args[1]));
        p5.display();
    }
}
