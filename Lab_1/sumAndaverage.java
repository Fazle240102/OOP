package Lab_1;

public class sumAndaverage{

    static void myMethod ()
    {
        System.out.println("FAZLE RABBI");
    }
    static void myMethod(String name)
    {
        System.out.println("Name: "+ name);
    }

    static void myMethod(String fname, String lname)
    {
        System.out.println(fname + " " + lname);
    }
    static int myMethod(int a, int b)
    {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {


   System.out.println("Hello World!!");
        int array[] = {1, 2, 3, 4 , 5, 6,7,8,9,10};
        int sum = 0;

        for(int i : array){
            sum += i;
        }
        float avg = (float)sum /array.length;
        System.out.println("sum: " + sum);
        System.out.println("avg: " + avg);

        int Array[] = {1, 2, 3, 4 , 5, 6,7,8,9,10};
        int Sum = 0;

        for(int i : Array){
            if(i == 6 || i == 7)
                continue;
            if(i == 9)
                break;
            Sum += i;
        }
        float Avg = (float)Sum /Array.length;
        System.out.println("sum: " + Sum);
        System.out.println("avg: " + Avg);

        int Add = myMethod(10,9);

        System.out.println(Add);
        myMethod();
        myMethod("Ashik");
        myMethod("Fazle","Rabbi");

    }
}