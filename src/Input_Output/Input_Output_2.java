package Input_Output;

import java.io.*;
import java.lang.*;
import java.util.*;

public class Input_Output_2 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Character, String, Integer, Float:");
        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str," ");
        String s1 = st.nextToken();
        String s2 = st.nextToken();
        String s3 = st.nextToken();
        String s4 = st.nextToken();

        s1 = s1.trim();
        s2 = s2.trim();
        s3 = s3.trim();
        s4 = s4.trim();

        char ch = s1.charAt(0);
        String s = s2;
        int i = Integer.parseInt(s3);
        float f = Float.parseFloat(s4);

        System.out.println("character is: "+ch);
        System.out.println("String is: "+s);
        System.out.println("Integer is: "+i);
        System.out.println("Float is: "+f);
}
}
