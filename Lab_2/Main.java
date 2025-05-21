package Lab_2;

import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        int [] array = new int[size];

        for(int i = 0; i < size; i++)
        {
            array[i] = in.nextInt();

        }
        int sum = 0;
        for(int i : array)
            sum+=i;
        System.out.println(sum);



        /*
        Scanner in = new Scanner(System.in);
        Circle c1 = new Circle();
        System.out.println("Enter the radius of a circle: ");
        c1.radius = in.nextFloat();
        c1.area();

         */
        /*
        Student s1 = new Student();
        System.out.println("Enter your name: ");
        s1.name= in.nextLine();
        System.out.println("Enter your ID: ");
        s1.id = in.nextInt();
        System.out.println("Enter your CGPA: ");
        s1.cgpa = in.nextFloat();

        s1.display();

         */

        /*
   Student s1 = new Student();
    s1.setValue("ABC", 12,3.5f);
    s1.display();

        Student s2 = new Student();
        s2.name = "CDE";
        s2.id = 14;
        s2.display();
        Teacher t1 = new Teacher();
        t1.setValue("CDE",18000);
        t1.display();
        System.out.println(t1.getSallary());

         */
    }
}