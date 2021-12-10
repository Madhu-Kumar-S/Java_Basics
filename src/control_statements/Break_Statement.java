package control_statements;

public class Break_Statement {
    public static void main(String[] args)
    {
        boolean x = true;
        b1:
        {
            b2:
            {
                b3:
                {
                    System.out.println("block 3");
                    if(x)
                    {
                        break b2;
                    }
                }
                System.out.println("block 2");
            }
            System.out.println("block 1");
        }
        System.out.println("out of all block");
    }
}
