package Lab_2;

public class Teacher {
    String name;
    float sallary;

    void display()
    {
        System.out.println("Name is  "+this.name + " Sallary is "+this.sallary);
    }
    void setValue(String name, int sallary)
    {
        this.name = name;
        this.sallary = sallary;
    }
    float getSallary()
    {
        return this.sallary;
    }
}
