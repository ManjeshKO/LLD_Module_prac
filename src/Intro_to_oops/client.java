package Intro_to_oops;

public class client {
    public static void main(String[] args) {
        Student mkoStudent = new Student("Manjesh");

        //mkoStudent.name = "Manjesh";
        mkoStudent.age = 30;
        mkoStudent.email = "manjeshk15@gmail.com";
        mkoStudent.pauseCourse();

        Student chmStudent = new Student("chaitra");
        //chmStudent.name = "Chaitra";
        chmStudent.changeBatch();


    }
}
