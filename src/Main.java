import Intro_to_oops.Student;
public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        Student vkoStudent = new Student("MKO");
        vkoStudent.age = 10;
        System.out.println(vkoStudent.age);
    }
}