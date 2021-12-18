package Arrays;

public class Single_Dimension_Array {
    public static void  main(String[] args)
    {
        int arr1[] = {5,2,9,1,8};
        int[] arr2= new int[5];
        arr2[0] = 1;
        arr2[1] = 2;
        arr2[2] = 3;
        arr2[3] = 4;
        arr2[4] = 5;

        System.out.println("Integer Array 1 is:");
        for(int i=0;i<arr1.length;i++)
        {
            System.out.printf("%d \t",arr1[i]);
        }

        System.out.println("\nInteger Array 2 is:");
        for(int i=0;i<arr2.length;i++)
        {
            System.out.printf("%d\t",arr2[i]);
        }

        float f1[] = {1.2f,1.3f,1.4f};
        float f2[] = new float[3];
        f2[0] = 2.4f;
        f2[1] = 4.5f;
        f2[2] = 7.9f;

        System.out.println("\nFloat Array 1 is:");
        for(int i=0;i<f1.length;i++)
        {
            System.out.printf("%f\t",f1[i]);
        }
        System.out.println("\nFloat Array 2 is:");
        for(int i=0;i<f2.length;i++)
        {
            System.out.printf("%f\t",f2[i]);
        }

        char c1[] = {'a','b','c'};
        char c2[];
        c2 = new char[3];
        c2[0] = 'd';
        c2[1] = 'e';
        c2[2] = 'f';

        System.out.println("\nCharacter Array 1 is:");
        for(int i=0;i<c1.length;i++)
        {
            System.out.printf("%c\t",c1[i]);
        }
        System.out.println("\nCharacter Array 2 is:");
        for(int i=0;i<c2.length;i++)
        {
            System.out.printf("%c\t",c2[i]);
        }

        String s1[] = {"madhu","kumar"};
        String s2[];
        s2 = new String[3];
        s2[0] = "Welcome";
        s2[1] = "to";
        s2[2] = "Java Programming";

        System.out.println("\nString Array 1 is:");
        for(int i=0;i<s1.length;i++)
        {
            System.out.printf("%s\t",s1[i]);
        }
        System.out.println("\nString Array 2 is:");
        for(int i=0;i<s2.length;i++)
        {
            System.out.printf("%s\t",s2[i]);
        }








    }
}
