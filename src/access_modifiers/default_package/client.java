package access_modifiers.default_package;
import access_modifiers.priavte_package.Student;
public class client {
    public static void main(String[] args) {
        Student mkoStudentPrivate = new Student();//imported mehtod from private package
        mkoStudentPrivate.setName("chm");
        mkoStudentPrivate.changBatch();
        access_modifiers.default_package.Student mkoStudentDefault = new access_modifiers.default_package.Student();
        mkoStudentDefault.age =30;
        mkoStudentDefault.setName("mko");
        mkoStudentDefault.pauseCourse();
    }
}
