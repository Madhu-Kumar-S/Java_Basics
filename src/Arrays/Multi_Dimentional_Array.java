package Arrays;

public class Multi_Dimentional_Array {
    public static void main(String[] args)
    {
        int[][] elements = {{1,2,3,4},
                            {5,6,7,8}};
        System.out.println("no of rows: "+elements.length);
        System.out.println("no of columns: "+elements[0].length);

        System.out.println("Elements are:");
        for(int i=0;i<elements.length;i++)
        {
            for(int j=0;j<elements[i].length;j++)
            {
                System.out.print(elements[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
