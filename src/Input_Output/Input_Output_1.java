package Input_Output;

import java.io.*;
import java.lang.*;

public class Input_Output_1 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Hello, World!");
        //to read single char : type 1
        System.out.println("Enter char1:");
        char ch1 = br.readLine().charAt(0);
        //to read single char : type 2
        System.out.println("Enter char2:");
        char ch2 = (char)br.read();
        br.skip(2);
        //to read a string
        System.out.println("Enter string:");
        String s = br.readLine();
        //to read an integer
        System.out.println("Enter integer:");
        int i = Integer.parseInt(br.readLine());
        //to read float
        System.out.println("Enter float:");
        float f = Float.parseFloat(br.readLine());

        System.out.println("char 1 is:"+ch1+"\nchar 2 is:"+ch2+"\nString is:"+s+"\nInteger is:"+i+"\nFloat is:"+f);
    }
}
