package Programs;

import java.io.*;
import java.lang.*;

public class Fibonacci_Series {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter upto how many terms:");
        int n = Integer.parseInt(br.readLine());
        System.out.println("Enter 1st term:");
        int f1 = Integer.parseInt(br.readLine());
        System.out.println("Enter 1st term:");
        int f2 = Integer.parseInt(br.readLine());
        System.out.println("Fibonacci series is:");
        System.out.print(f1+"\t"+f2+"\t");
        int i = 3;
        while(i<=n)
        {
            int f = f1+f2;
            System.out.print(f+"\t");
            f1 = f2;
            f2 = f;
            i++;
        }
    }
}
