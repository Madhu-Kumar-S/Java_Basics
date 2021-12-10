package control_statements;

public class Nested_Loops {
    public static void main(String[] args)
    {
        int i=1,j;
        while (i<=3)
        {
            System.out.print(i);
            for(j=1;j<=5;j++)
            {
                System.out.println("\t"+j);
            }
            System.out.println("----------");
            i++;
        }
    }
}
