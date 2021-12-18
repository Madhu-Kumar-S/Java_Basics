package Input_Output;

import java.io.*;
import java.util.*;

public class Input_Output_3 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter character string  integer float value:");
        char ch = sc.next().charAt(0);
        // System.out.println("Enter string:");
        String s1 = sc.next();  // to read a single string
        // System.out.println("Enter integer:");
        int i = sc.nextInt();
        // System.out.println("Enter float:");
        float f = sc.nextFloat();

        System.out.println("character is: "+ch+"\nString s1 is: "+s1+"\nInteger is: "+i+"\nFloat is: "+f);

    }
}
