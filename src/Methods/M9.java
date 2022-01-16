package Methods;

class Swap1
{
    void swap(int num1,int num2)
    {
        int temp = num1;
        num1 = num2;
        num2 = temp;
    }

}
class Check
{
    int obj;
    Check(int obj)
    {
        this.obj=obj;
    }

}
class Swap2
{
    void swap(Check obj1,Check obj2)
    {
        Check temp;
        temp = obj1;
        obj1 = obj2;
        obj2 = temp;

    }
}
class Check2
{
    int n1, n2;
    Check2(int n1, int n2)
    {
        this.n1=n1;
        this.n2=n2;
    }
}
class Swap3
{
    void swap(Check2 obj)
    {
        int temp;
        temp=obj.n1;
        obj.n1=obj.n2;
        obj.n2=temp;
    }

}

public class M9 {
    public static void main(String[] args)
    {
        // passing values to methods
        // here separate copy of the values gets passes
        // so any changes made inside the methods will not affect outside
        int num1=10, num2=20;
        System.out.println("Before swapping:\n"+num1+"\t"+num2);
        Swap1 s1 = new Swap1();
        s1.swap(num1,num2);
        System.out.println("After swapping:\n"+num1+"\t"+num2);

        // passing objects to methods
        // here bit by bit copy of the objects are passed
        // so any changes made to the original copy will not affect other
        Check obj1 = new Check(num1);
        Check obj2 = new Check(num2);
        System.out.println("Before swapping:\n"+obj1.obj+"\t"+obj2.obj);
        Swap2 s2 = new Swap2();
        s2.swap(obj1,obj2);
        System.out.println("After swapping:\n"+obj1.obj+"\t"+obj2.obj);

        Check2 c2 = new Check2(num1,num2);
        Swap3 s3 = new Swap3();
        System.out.println("Before swapping:\n"+c2.n1+"\t"+c2.n2);
        s3.swap(c2);
        System.out.println("After swapping:\n"+c2.n1+"\t"+c2.n2);



    }
}
