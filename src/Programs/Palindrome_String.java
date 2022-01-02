package Programs;

import java.io.*;

public class Palindrome_String {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a string:");
        String s = br.readLine();
        String temp = s;
        StringBuffer sb = new StringBuffer(temp);
        String ns = sb.reverse().toString();

        if(s.equalsIgnoreCase(ns)) System.out.println("Given String "+s+" is palindrome.");
        else System.out.println("Given String "+s+" is not palindrome.");
    }
}
