package Methods;

// passing arrays to methods

import java.io.*;
import java.util.*;

class Matrix
{
    private final int r;
    private final int c;
    private final int[][] arr;

    Matrix(int r, int c)
    {
        this.r=r;
        this.c=c;
        arr = new int[r][c];
    }
    int[][] getMatrix() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<r;i++)
        {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);
            for(int j=0;j<c;j++)
            {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        return arr;
    }
    int[][] sumMatrix(int[][] a, int[][] b)
    {
        int[][] temp = new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                temp[i][j] = a[i][j]+b[i][j];
            }
        }
        return temp;
    }
    void display(int[][] res)
    {
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(res[i][j]+"\t");
            }
            System.out.println();
        }
    }
}

public class M10 {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Row:");
        int row = sc.nextInt();
        System.out.println("Enter Column:");
        int column = sc.nextInt();

        Matrix m1 = new Matrix(row,column);
        Matrix m2 = new Matrix(row,column);
        int[][] x,y,z;

        System.out.println("Enter matrix1:");
        x = m1.getMatrix();
        System.out.println("Enter matrix2:");
        y = m2.getMatrix();

        z = m1.sumMatrix(x,y);
        System.out.println("Sum of the matrix is:");
        m1.display(z);



    }
}
