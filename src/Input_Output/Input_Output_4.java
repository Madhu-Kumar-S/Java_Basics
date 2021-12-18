package Input_Output;


public class Input_Output_4 {
    public static void main(String[] args)
    {
        char c = 'C';
        String s = "Hello";
        int i = 1;
        float f = 2.3F;

        System.out.printf("Character is: %c%nString is: %s%nInteger is: %d%nFloat is: %f",c,s,i,f);

        int num = 10;
        System.out.printf("%nOctal num of %d is %o",num,num);
        System.out.printf("%nHexadecimal num of %d is %x",num,num);
        System.out.println("\nbinary num is: "+Integer.toBinaryString(num));
        System.out.println("Octal num is: "+Integer.toOctalString(num));
        System.out.println("Hexa decimal is: "+Integer.toHexString(num));

    }
}
