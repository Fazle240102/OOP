package Lab_2;

public class Student {
    String name;
    int id;
    float cgpa;

    void display()
    {
        System.out.println("Name is  "+this.name + " ID is "+this.id + " CGPA is "+this.cgpa);
    }
    void setValue(String name, int id, float cgpa)
    {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }
    float getCgpa()
    {
        return this.cgpa;
    }

}

