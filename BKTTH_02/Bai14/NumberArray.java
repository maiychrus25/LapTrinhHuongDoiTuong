package Bai14;

import java.util.Arrays;
import java.util.Scanner;

public class NumberArray {
  private int n;
  private int[] vals;

  public NumberArray() {
    this.n = 0;
  }

  public NumberArray(int n, int[] vals) {
    this.n = n;
    this.vals = vals;
  }

  public void inputInfo() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Nhap va so luong phan tu: ");
    do {
      System.out.print("Nhap vao so luong cac phan tu (2 <= m <= 100): ");
      this.n = Integer.parseInt(sc.nextLine());
    } while (this.n < 2 || this.n > 100);

    this.vals = new int[this.n];
    System.out.print("Nhap gia tri cho cac phan tu: ");

    for (int i = 0; i < this.n; ++i) {
      vals[i] = sc.nextInt();
    }
    sc.close();
  }

  public void sortedAray() {
    Arrays.sort(this.vals);
  }

  public void displayArray() {
    for (int i = 0; i < this.n; ++i) {
      System.out.print(this.vals[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    NumberArray numberArray = new NumberArray();

    numberArray.inputInfo();
    numberArray.sortedAray();
    numberArray.displayArray();
  }
}
