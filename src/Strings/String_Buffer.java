package Strings;

import java.awt.*;

public class String_Buffer {
    public static void main(String[] args)
    {
        // StringBuffer class are mutable
        // 1.passing string to String-buffer class
        StringBuffer sb1 = new StringBuffer("Hello");
        System.out.println(sb1);

        //2.passing capacity for storing n no of characters in string buffer
        StringBuffer sb2 = new StringBuffer(50);
        sb2.append("Hello");
        sb2.append("Welcome");
        System.out.println(sb2);
        sb2.insert(12, "Alice");
        System.out.println(sb2);
        System.out.println(sb2.indexOf("Hello"));
    }
}
