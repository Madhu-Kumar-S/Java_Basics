package Programs;

import java.io.*;

public class Factorial {
    public static void main(String[] args) throws IOException {
        System.out.println("***** Factorial of a Given Number*****");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number: ");
        int num = Integer.parseInt(br.readLine());

        int fact = 1;
        for(int i=1;i<num+1;i++)
        {
            fact = fact*i;
        }
        System.out.println("Factorial of a given number is: "+fact);


    }
}
