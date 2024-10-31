// package BKTTH_02.Bai6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentManagement {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = 0;

    while (n < 2 || n > 50) {
      try {
        System.out.print("Nhap so luong sinh vien (2 <= n <= 50): ");
        n = Integer.parseInt(sc.nextLine());
      } catch (NumberFormatException ex) {
        System.out.println("So luong khong dung dinh dang.");
      }
    }

    ArrayList<HighSchoolStudent> listStudent = new ArrayList<>();

    for (int i = 0; i < n; ++i) {
      try {
        HighSchoolStudent student = new HighSchoolStudent();
        student.inputInfo(sc);

        student.isValidName();
        student.isValidateScore();

        listStudent.add(student);
      } catch (NumberFormatException ex) {

      } catch (EmptyInputException | InvalidScoreException ex) {
        System.out.println(ex.getMessage());
      } catch (Exception ex) {
        System.out.println(ex.getMessage());
      } finally {
        if (i == n - 1) {
          sc.close();
        }
      }
    }

    Collections.sort(listStudent, new SortByAverageScore());
    for (HighSchoolStudent x : listStudent) {
      System.out.println(x.toString());
    }
  }
}