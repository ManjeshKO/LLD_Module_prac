package access_modifiers.priavte_package;

public class client {
    public static void main(String[] args) {
        Student mkoStudent = new Student();
        mkoStudent.age =30;
        mkoStudent.setName("MKO");
        mkoStudent.pauseCourse();
    }
}
