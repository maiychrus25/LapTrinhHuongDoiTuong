package Bai9;

import java.util.ArrayList;
import java.util.Scanner;

public class Number {
  private int m;

  public Number() {
  }

  public Number(int m) {
    this.m = m;
  }

  public boolean isPrime(int n) {
    for (int i = 2; i <= Math.floor(Math.sqrt(n)); ++i) {
      if (n % i == 0)
        return false;
    }
    return n > 1;
  }

  public ArrayList<Integer> getPrimeNumbers() {
    ArrayList<Integer> primes = new ArrayList<>();

    for (int i = 2; i <= this.m; ++i) {
      if (isPrime(i))
        primes.add(i);
    }

    return primes;
  }

  @Override
  public String toString() {
    String answer = "";
    ArrayList<Integer> primes = this.getPrimeNumbers();

    for (int i = 0; i < primes.size(); ++i)
      answer = answer + primes.get(i) + " ";
    return answer.trim();
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int m = 0;
    while (m < 2 || m > 100) {
      try {
        System.out.print("Nhap so (2 <= n <= 100): ");
        m = Integer.parseInt(sc.nextLine());
      } catch (NumberFormatException ex) {
        System.out.println(ex.getMessage());
      }
    }

    sc.close();
    Number num = new Number(m);
    System.out.println(num.toString());
  }
}
