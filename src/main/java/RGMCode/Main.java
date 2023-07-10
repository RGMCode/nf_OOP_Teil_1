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

/*        Student studentJemandAnderes = new Student(1927, "Steinmeier", "Magret");
        System.out.println(studentJemandAnderes.getStudentID() + " " + studentJemandAnderes.getLastName() + " " +  studentJemandAnderes.getFirstName());
        System.out.println(studentJemandAnderes);


        Student studentRene = new Student(1234, "Mengedoth", "René");
        System.out.println(studentRene.getStudentID() + " " + studentRene.getLastName() + " " +  studentRene.getFirstName());
        System.out.println(studentRene);


        Student studentClenn = new Student(2345, "Acrivopoulos", "Clenn");
        System.out.println(studentClenn.getStudentID() + " " + studentClenn.getLastName() + " " +  studentClenn.getFirstName());
        System.out.println(studentClenn);*/


        Student studentAndreas = new Student(3456, "Blank", "Andreas");
       /* System.out.println(studentAndreas.getStudentID() + " " + studentAndreas.getLastName() + " " +  studentAndreas.getFirstName());
        System.out.println(studentAndreas);
*/
        Student studentAndreas2 = new Student(3456, "Blank", "Andreas");
   /*     System.out.println(studentAndreas2.getStudentID() + " " + studentAndreas2.getLastName() + " " +  studentAndreas2.getFirstName());
        System.out.println(studentAndreas2);*/


/*        System.out.println(studentAndreas.hashCode());
        System.out.println(studentAndreas2.hashCode());
        System.out.println(studentAndreas.equals(studentAndreas2));
        */
    }

    public static boolean aufgabeBool(boolean boolTrue){
        Student studentAndreas = new Student(3456, "Blank", "Andreas");
        System.out.println(studentAndreas.hashCode());

        Student studentAndreas2 = new Student(3456, "Blank", "Andreas");
        System.out.println(studentAndreas2.hashCode());

        //System.out.println(studentAndreas.equals(studentAndreas2));

        if (studentAndreas.equals(studentAndreas2)){
            return true;
        } else {
            return false;
        }
    }

}