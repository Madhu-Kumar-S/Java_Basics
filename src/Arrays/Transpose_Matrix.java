package Arrays;

import java.util.*;

public class Transpose_Matrix {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows and columns:");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] arr = new int[r][c];

        for(int i=0;i<r;i++)
        {
            System.out.println("Enter row "+i+" elements");
            for(int j=0;j<c;j++)
            {
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        System.out.println("Matrix is:");
        for(int i =0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }

        System.out.println("Transpose of matrix is:");
        for(int i =0;i<c;i++)
        {
            for(int j=0;j<r;j++)
            {
                System.out.print(arr[j][i]+"\t");
            }
            System.out.println();
        }

    }
}
