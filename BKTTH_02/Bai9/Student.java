package Bai9;

import java.util.ArrayList;
import java.util.Scanner;

public class Student extends Person {
  private String studentId;
  private String studentClass;
  private Double gpa;

  public Student() {
  }

  public Student(String name, int birthYear, String address,
      String studentId, String studentClass, double gpa) {
    super(name, birthYear, address);
    this.studentId = studentId;

    this.studentClass = studentClass;
    this.gpa = gpa;
  }

  public double getGpa() {
    return this.gpa;
  }

  public void isValidateGpa() throws InvalidGpaException {
    if (this.gpa < 0.0 || this.gpa > 10.0) {
      throw new InvalidGpaException("Diem trung binh phai trong khoang 0.0 - 10.0.");
    }
  }

  @Override
  public void isValidStudentInfo() throws EmptyInputException {
    if (this.studentId.trim().isEmpty())
      throw new EmptyInputException("Ma sinh vien khong hop le.");

    if (this.studentClass.trim().isEmpty())
      throw new EmptyInputException("Lop khong hop le.");
  }

  @Override
  public void inputInfo(Scanner sc) {
    super.inputInfo(sc);
    System.out.print("Nhap ma sinh vien: ");
    this.studentId = sc.nextLine();

    System.out.print("Nhap lop: ");
    this.studentClass = sc.nextLine();

    System.out.print("Nhap diem trung binh: ");
    this.gpa = Double.parseDouble(sc.nextLine());
  }

  @Override
  public String toString() {
    return super.toString() + "\nMa sinh vien: " + this.studentId
        + "\nLop sinh vien: " + this.studentClass + "\nDiem trung binh: " + this.gpa;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = 0;
    while (n <= 0) {
      try {
        System.out.print("Nhap so (2 <= n <= 100): ");
        n = Integer.parseInt(sc.nextLine());
      } catch (NumberFormatException ex) {
        System.out.println(ex.getMessage());
      }
    }
    ArrayList<Student> listStudent = new ArrayList<>();

    for (int i = 0; i < n; ++i) {
      try {
        Student student = new Student();
        student.inputInfo(sc);

        student.isValidateGpa();
        student.isValidStudentInfo();

        listStudent.add(student);
      } catch (EmptyInputException | InvalidGpaException ex) {
        System.out.println(ex.getMessage());
      } catch (Exception ex) {
        System.out.println(ex.getMessage());
      } finally {
        if (i == n - 1)
          sc.close();
      }
    }

    boolean found = false;
    for (Student x : listStudent) {
      if (x.getGpa() >= 8.0) {
        found = true;
        System.out.println(x.toString());
      }
    }

    if (!found)
      System.out.println("Not found.");
  }
}
