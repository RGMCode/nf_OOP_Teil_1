package RGMCode;

import RGMCode.model.Student;

public class Main {
    public static void main(String[] args) {


        /*
        Student studentRene = new Student();

        studentRene.setStudentID(1234);
        studentRene.setLastName("Mengedoth");
        studentRene.setFirstName("René");
        System.out.println(studentRene.getStudentID());
        System.out.println(studentRene.getLastName());
        System.out.println(studentRene.getFirstName());

        System.out.println("-------------");

        Student studentClenn = new Student();
        studentClenn.setStudentID(2345);
        studentClenn.setLastName("Acrivopoulos");
        studentClenn.setFirstName("Clenn");
        System.out.println(studentClenn.getStudentID());
        System.out.println(studentClenn.getLastName());
        System.out.println(studentClenn.getFirstName());

        System.out.println("-------------");

        Student studentAndreas = new Student();
        studentAndreas.setStudentID(3456);
        studentAndreas.setLastName("Blank");
        studentAndreas.setFirstName("Andreas");
        System.out.println(studentAndreas.getStudentID());
        System.out.println(studentAndreas.getLastName());
        System.out.println(studentAndreas.getFirstName());
        */

        Student studentJemandAnderes = new Student(1927, "Steinmeier", "Magret");
        System.out.println(studentJemandAnderes.getStudentID() + " " + studentJemandAnderes.getLastName() + " " +  studentJemandAnderes.getFirstName());
        System.out.println(studentJemandAnderes.toString());


        Student studentRene = new Student(1234, "Mengedoth", "René");
        System.out.println(studentRene.getStudentID() + " " + studentRene.getLastName() + " " +  studentRene.getFirstName());
        System.out.println(studentRene.toString());


        Student studentClenn = new Student(2345, "Acrivopoulos", "Clenn");
        System.out.println(studentClenn.getStudentID() + " " + studentClenn.getLastName() + " " +  studentClenn.getFirstName());
        System.out.println(studentClenn.toString());


        Student studentAndreas = new Student(3456, "Blank", "Andreas");
        System.out.println(studentAndreas.getStudentID() + " " + studentAndreas.getLastName() + " " +  studentAndreas.getFirstName());
        System.out.println(studentAndreas.toString());


    }


}