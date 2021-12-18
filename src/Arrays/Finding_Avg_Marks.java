package Arrays;

import java.io.*;

public class Finding_Avg_Marks {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many Subjects:");
        int n = Integer.parseInt(br.readLine());

        int[] marks = new int[n];
        System.out.println("Enter Marks of 5 students:");
        int sum = 0;
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter sub "+(i+1)+" mark:");
            int m = Integer.parseInt(br.readLine());
            marks[i] = m;
            sum = sum+marks[i];
        }
        System.out.println("Total marks is: "+sum);
        float avg = (float)sum/n;
        System.out.println("Average is: "+avg);

    }
}
