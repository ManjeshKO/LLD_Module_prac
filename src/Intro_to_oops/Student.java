package Intro_to_oops;

public class Student
{
    private String name;
    String email;
    public int age;

    public Student(String name){
        this.name = name;
    }
    public void changeBatch()
    {
        System.out.println(this.name+" is changing the batch");
    }

    public void pauseCourse()
    {
        System.out.println(this.name+" is pausing their course");
    }
}
