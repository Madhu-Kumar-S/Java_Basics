package control_statements;

public class Continue_Statement {
    public static void main(String[] args)
    {
        for(int i=1;i<=10;i++)
        {
            if(i==4 || i==8) continue;
            System.out.print(i+"\t");
        }
    }
}
