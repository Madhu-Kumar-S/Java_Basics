package Strings;

import java.util.Locale;

public class String_Methods {
    public static void main(String[] args)
    {
        String s1 = "ShinChan";
        String surname = "Nohara";
        String s2 = "Himawari";
        String s3 = "Mixe";
        String s4 = "Harry";
        String s5 = "Shiro";

        // joining strings
        System.out.println(s1.concat(surname));
        System.out.println(s3+" "+surname);
        System.out.println(s4+" "+surname);

        // length of a string
        System.out.println("No of characters in string "+s1+" are "+s1.length());

        //to find character in a given position
        int pos = 5;
        System.out.printf("5th char position in %s is %c",s1,s1.charAt(5-1));

        //comparision of 2 strings
        System.out.println("\n"+s1.compareTo(s2));
        System.out.println(s4.compareToIgnoreCase(s5));
        System.out.println("abc".equals("abc"));
        System.out.println("Abc".equalsIgnoreCase("abc"));

        //starts or ends with a char
        System.out.println(s4.startsWith("H"));
        System.out.println(s5.endsWith("o"));
        System.out.println("This is a book".indexOf("is"));

        //replace chars
        String n = s4.replace('H','h');
        System.out.println(n);

        //changing case

        String n1 = s5.toLowerCase(Locale.ROOT);
        String n2 = n.toUpperCase(Locale.ROOT);
        System.out.println(n1+"\n"+n2);

        String str = "Welcome to java programming";
        char arr[] = new char[20];
        str.getChars(5,10,arr,1);
        System.out.println(arr);

        // spliting strings
        String s = "Welcome to java programming";
        String[] sa = s.split(" ");
        for(String i: sa)
        {
            System.out.println(i);
        }



    }
}
