package access_modifiers.protected_package;
import access_modifiers.protected_package.juniorStudent.Student;
public class client extends Student {
    public static void main(String[] args) {
        client mkojun = new client();
        mkojun.setName("geet");
        mkojun.changBatch();
        mkojun.setAge(3);
        System.out.println("protected age:"+mkojun.getAge());
        //uncomment and check the difference
        /*Student chmjun = new Student();
        chmjun.setName("mko");
        chmjun.changBatch();
        chmjun.setAge(30);
        System.out.println("protected age:"+chmjun.getAge());*/
    }
}
