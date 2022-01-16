package Methods;

import java.io.*;

public class Recursive_Method {
    static  int factorial(int num)
    {
        if(num==1) return 1;
        return num*factorial(num-1);
    }

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number: ");
        int num = Integer.parseInt(br.readLine());
        System.out.println("Factorial of a given number is: "+Recursive_Method.factorial(num));
    }
}
