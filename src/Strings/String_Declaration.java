package Strings;

public class String_Declaration {
    public static void main(String[] args)
    {
        String s1 = "Hello";

        String s2 = new String("Welcome");

        char[] c = {'A','l','i','c','e'};
        String s3 = new String(c);
        String s4 = new String(c,0,3);

        System.out.printf("%s %s %s %s",s1,s2,s3,s4);
    }
}
