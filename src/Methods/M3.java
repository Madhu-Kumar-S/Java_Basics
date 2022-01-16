package Methods;

import java.io.*;

// Pgm without parameters and with return type
class M33
{
    private final int num1;
    private final int num2;

    M33(int x, int y)
    {
        num1=x;
        num2=y;
    }
    protected int sum()
    {
        return num1 + num2;
    }

}


public class M3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter value 1: ");
        int x = Integer.parseInt(br.readLine());
        System.out.print("Enter value 2: ");
        int y = Integer.parseInt(br.readLine());
        M33 m = new M33(x,y);
        int res = m.sum();
        System.out.println("Sum is: "+(res));
    }
}
