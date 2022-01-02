package Strings;

public class String_Comparison {
    public static void main(String[] args)
    {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");

        /* == operator compares the object references(unique hexa-decimal
        number that represents the memory of an object)
         */
        if(s1 == s2) System.out.println("Equal");
        else System.out.println("Not equal");
        if(s1 == s3) System.out.println("Equal");
        else System.out.println("Not equal");

        /* .equals() method compares the contents */
        if(s1.equals(s2)) System.out.println("Equal");
        else System.out.println("Not equal");
        if(s1.equals(s3)) System.out.println("Equal");
        else System.out.println("Not equal");

    }
}
