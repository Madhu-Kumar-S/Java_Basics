package Programs;

import java.io.*;
import java.lang.*;

public class Leap_Year {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Year:");
        int yr = Integer.parseInt(br.readLine());

        if((yr%100==0 && yr%400==0)||(yr%100!=0 && yr%4==0))
        {
            System.out.println("Given Year "+yr+" is Leap year");
        }
        else
        {
            System.out.println("Given Year "+yr+" is not Leap year");
        }

    }
}
