package Command_Line_Arguments;

public class Cmd1 {
    public static void main(String[] args)
    {
        System.out.println("Length of the cmd line arguments is: "+args.length);
        for (String arg : args)
        {
            System.out.println(arg);
        }
    }
}
