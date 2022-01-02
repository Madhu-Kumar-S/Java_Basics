package Classes_Objects;

class Student
{
    // initializing variables
    String name = "Madhu";
    int roll_no = 56;
    // declaring methods
    void show()
    {
        System.out.println("Student Details are:");
        System.out.println("Name is: "+name);
        System.out.println("Roll Number is: "+roll_no);
    }
}
public class Demo {
    public  static  void main(String[] args)
    {
        // object creation
        Student1 s = new Student1();
        //calling methods of another class from main class
        s.show();
        // hash code - unique reference number given to objects except for string objects
        System.out.println("Hash code is: "+s.hashCode());
    }
}
