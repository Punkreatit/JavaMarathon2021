package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Ivan","Stupidity");
        Student student1 = new Student("Ololosha","22B");

        System.out.println("учебная группа: "+student1.getGroupName());
        System.out.println("учебная дисциплина: "+teacher1.getSubjectName());
        teacher1.printInfo();
        student1.printInfo();

    }
}
