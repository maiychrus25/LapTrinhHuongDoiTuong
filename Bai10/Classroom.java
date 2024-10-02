package Bai10;

import java.util.Scanner;

public class Classroom {
    private String classCode;
    private String className;
    protected int studentCount;

    public Classroom() {}

    public Classroom(String classCode, String className, int studentCount) {
        this.classCode = classCode;
        this.className = className;
        this.studentCount = studentCount;
    }

    public void input(Scanner sc) {
        System.out.print("Enter class code: ");
        this.classCode = sc.nextLine();

        System.out.print("Enter class name: ");
        this.className = sc.nextLine();

        System.out.print("Enter student count: ");
        this.studentCount = Integer.parseInt(sc.nextLine());
    }

    public void validateStudentCount() throws InvalidStudentCountException {
        if (this.studentCount <= 0) {
            throw new InvalidStudentCountException("Student count must be greater than 0.");
        }
    }

    @Override
    public String toString() {
        return "Class Code: " + this.classCode + "\nClass Name: " + this.className +
               "\nStudent Count: " + this.studentCount;
    }
}
