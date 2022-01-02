package Command_Line_Arguments;

public class Cmd_Addition {
    public static void main(String[] args)
    {
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        System.out.println("Sum is: "+(n1+n2));
    }
}
