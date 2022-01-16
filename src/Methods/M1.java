package Methods;

import java.io.*;

// Pgm without parameters and without return type
class M11
{
    private final int num1;
    private final int num2;

    M11(int x, int y)
    {
        num1=x;
        num2=y;
    }
    protected void sum()
    {
        int sum = num1 + num2;
        System.out.println("Sum is: "+(sum));
    }

}


public class M1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter value 1: ");
        int x = Integer.parseInt(br.readLine());
        System.out.print("Enter value 2: ");
        int y = Integer.parseInt(br.readLine());
        M11 m = new M11(x,y);
        m.sum();
    }
}
