package Intro_to_oops;

public class Student
{
    String name;
    String email;
    int age;

    void changeBatch()
    {
        System.out.println(this.name+" is changing the batch");
    }

    void pauseCourse()
    {
        System.out.println(this.name+" is pausing their course");
    }
}
