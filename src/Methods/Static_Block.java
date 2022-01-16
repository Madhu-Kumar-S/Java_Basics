package Methods;


/* Static block gets executed automatically on higher priority basis
 before the main method */

public class Static_Block {
    static
    {
        System.out.println("Static block");
    }
    public static void main(String[] args)
    {
        System.out.println("Main method");
    }
}
