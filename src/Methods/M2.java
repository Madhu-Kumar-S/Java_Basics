package Methods;

import java.io.*;

// Pgm with parameters and return type
class M22
{
    protected int sum(int x, int y)
    {
        return x+y;
    }

}


public class M2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter value 1: ");
        int x = Integer.parseInt(br.readLine());
        System.out.print("Enter value 2: ");
        int y = Integer.parseInt(br.readLine());
        M22 m = new M22();
        int res = m.sum(x,y);
        System.out.println("Sum is: "+(res));
    }
}
