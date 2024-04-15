package access_modifiers.protected_package.juniorStudent;

public class Student {
    private String name;
     int age;
    void pauseCourse()
    {
        System.out.println(this.name+" is pausing his course");
    }
    public void changBatch()
    {
        System.out.println(this.name+" is changing batch");
    }
    public void setName(String name)
    {
        this.name = name;
    }
    protected void setAge(int age)
    {
        this.age=age;
    }
    protected int getAge()
    {
        return this.age;
    }
}

