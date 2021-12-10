package control_statements;

import java.awt.*;

public class Return_Statement {
    public static void main(String[] args)
    {
        int result = Return_Statement.my_method(2);
        System.out.println("square of a number = "+result);
        System.exit(0);  // this statement terminates the program normally
        // System.exit(1);  this statement displays the error if encountered in program
    }
    static int my_method(int value)
    {
        return value*value;  // this statement use to come out of the method
    }
}
