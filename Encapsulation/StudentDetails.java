package Encapsulation;

public class StudentDetails {

    public static void main(String[] args) {

        Student student = new Student();
        student.rollNo = 101;
        student.name = "John Wick";
        student.age = 21;
        student.course = "CSE";
        student.fee = 60000;

        System.out.println("Student Details: ");
        System.out.println(student.rollNo);
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.course);
        System.out.println(student.fee);

        student.setCgpa(8.91);                  // setter method is called
        System.out.println(student.getCgpa());  // getter method is called
    }
}
