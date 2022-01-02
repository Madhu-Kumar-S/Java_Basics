package Strings;

import java.io.*;

public class Find_Given_String {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter how many Strings ?");
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter String "+(i+1)+": ");
            arr[i] = br.readLine();
        }
        System.out.print("Enter a string to search: ");
        String find = br.readLine();

        for(int i=0;i<n;i++)
        {
            if(find.equalsIgnoreCase(arr[i]))
            System.out.println("String "+find+" is found at position "+(i+1));
        }

    }
}
