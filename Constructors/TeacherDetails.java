package Constructors;

public class TeacherDetails {

    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        System.out.println("Teacher Details: ");
        System.out.println(teacher.getId());
        System.out.println(teacher.getName());
        System.out.println(teacher.getDesignation());
        System.out.println(teacher.getQualification());
        System.out.println(teacher.getSalary());
        System.out.println();

        Teacher teacher2 = new Teacher(1202, "Mr. PQR", "Assi. Professor", "M.E. CSE", 60000);
        System.out.println(teacher2.getId());
        System.out.println(teacher2.getName());
        System.out.println(teacher2.getDesignation());
        System.out.println(teacher2.getQualification());
        System.out.println(teacher2.getSalary());
    }
}
