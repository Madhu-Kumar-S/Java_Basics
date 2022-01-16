package Methods;

class Sample
{
    private int x; // instance variables
    Sample()
    {
        this(56); // call present class parameterized constructor and pass variable to it
        this.show(); // call present class method
    }
    Sample(int x)
    {
        this.x = x; // refer present class instance variable
    }
    void show()
    {
       System.out.println("x = "+x);
    }
}

public class This_Keyword {
    public static void main(String[] args)
    {
        Sample s = new Sample();
    }
}
