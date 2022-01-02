package Command_Line_Arguments;

class Class1{
    public static void main(String[] args)
    {
        System.out.println("Names are:");
        for (String s : args) {
            System.out.println(s);
        }
    }
}
class Class2 {
    public static void main(String[] args)
    {
        String[] names = {"Madhu","Kumar","Srinivas"};
        Class1.main(names);
    }
}
