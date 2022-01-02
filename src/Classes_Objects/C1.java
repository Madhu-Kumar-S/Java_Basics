package Classes_Objects;

class Student1
{
    // printing default name of the variables
    String name;
    int roll_no;
    void show()
    {
        System.out.println("hello my name is "+name);
        System.out.println("my roll number is "+roll_no);
    }
}
public class C1 {
    public  static  void main(String[] args)
    {
        Student1 s = new Student1();
        s.show();
    }
}
