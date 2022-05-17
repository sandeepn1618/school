package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class SchoolMain {
    public static void main(String[] args) {
        Teacher sandeep = new Teacher(1, "Sandeep", 500);
        Teacher zeeshan = new Teacher(2, "Zeeshan", 700);
        Teacher anchal = new Teacher(3, "Anchal", 900);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(sandeep);
        teacherList.add(zeeshan);
        teacherList.add(anchal);


        Student neha = new Student(1, "Neha", 4);
        Student subha = new Student(2, "Subhahar", 12);
        Student ramya = new Student(3, "Ramya", 5);
        List<Student> studentList = new ArrayList<>();

        studentList.add(neha);
        studentList.add(subha);
        studentList.add(ramya);


        School ghs = new School(teacherList, studentList);

        Teacher megan = new Teacher(6, "Megan", 900);

        ghs.addTeacher(megan);


        neha.payFees(5000);
        subha.payFees(6000);
        System.out.println("CPG has earned $" + ghs.getTotalMoneyEarned());

        System.out.println("------Making SCHOOL PAY SALARY----");
        sandeep.receiveSalary(sandeep.getSalary());
        System.out.println("CPG has spent for salary to " + sandeep.getName()
                + " and now has $" + sandeep.getSalary() + " and school has now" + ghs.getTotalMoneyEarned());

        megan.receiveSalary(megan.getSalary());
        System.out.println("CPG has spent for salary to " + megan.getName()
                + " and now has $" + ghs.getTotalMoneyEarned());

        anchal.receiveSalary(anchal.getSalary());
        System.out.println("CPG has spent for salary to " + anchal.getName()
                + " and now has $" + ghs.getTotalMoneyEarned());


        System.out.println(sandeep);

        anchal.receiveSalary(anchal.getSalary());

        System.out.println(anchal);


    }
}
