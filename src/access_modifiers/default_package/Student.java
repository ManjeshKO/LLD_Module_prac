package access_modifiers.default_package;

public class Student {
    private String name;
    int age;

    void pauseCourse()
    {
        System.out.println(this.name+" is pausing his course");
    }
    void changeBatch()
    {
        System.out.println(this.name+" is changing the batch");
    }
    void setName(String name)
    {
        this.name = name;
    }
}
