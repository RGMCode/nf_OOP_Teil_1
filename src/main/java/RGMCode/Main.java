package RGMCode;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();

        student.studentID = 1234;
        student.lastName = "Mengedoth";
        student.firstName = "René Gustavo";
        System.out.println(student.studentID);
        System.out.println(student.lastName);
        System.out.println(student.firstName);

        System.out.println("-------------");

        student.studentID = 2345;
        student.lastName = "Acrivopoulos";
        student.firstName = "Clean";
        System.out.println(student.studentID);
        System.out.println(student.lastName);
        System.out.println(student.firstName);

        System.out.println("-------------");

        student.studentID = 3456;
        student.lastName = "Blank";
        student.firstName = "Andreas";
        System.out.println(student.studentID);
        System.out.println(student.lastName);
        System.out.println(student.firstName);
    }
}