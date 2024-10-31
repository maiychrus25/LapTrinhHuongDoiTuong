//Author: MAIY 07!!
package BKTTH_01.Bai10;

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
        System.out.print("Nhap ma lop: ");
        this.classCode = sc.nextLine();

        System.out.print("Nhap ten lop: ");
        this.className = sc.nextLine();

        System.out.print("Nhap so luong hoc sinh: ");
        this.studentCount = Integer.parseInt(sc.nextLine());
    }

    public void validateStudentCount() throws InvalidStudentCountException {
        if (this.studentCount <= 0) {
            throw new InvalidStudentCountException("So luong hoc sinh phai lon 0.");
        }
    }

    @Override
    public String toString() {
        return "Ma lop hoc: " + this.classCode + "\nTen lop hoc: " + this.className +
               "\nSo luong hoc sinh: " + this.studentCount;
    }
}
