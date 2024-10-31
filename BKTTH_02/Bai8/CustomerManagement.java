package Bai8;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class CustomerManagement {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = 0;

    while (n < 2 || n > 100) {
      try {
        System.out.print("Nhap so luong khach hang (2 <= n <= 100): ");
        n = Integer.parseInt(sc.nextLine());
      } catch (NumberFormatException ex) {
        System.out.println(ex.getMessage());
      }
    }

    ArrayList<CustomerVIP> listCustomer = new ArrayList<>();
    for (int i = 0; i < n; ++i) {
      try {
        CustomerVIP customer = new CustomerVIP();
        customer.inputInfor(sc);

        customer.isValidateRank();
        customer.isValidDiscount();

        customer.isValidateCustomerinfor();
        listCustomer.add(customer);
      } catch (NumberFormatException ex) {
        System.out.println(ex.getMessage());
      } catch (InvalidRankException | InvalidDiscountException ex) {
        System.out.println(ex.getMessage());
      } catch (EmptyInputException ex) {
        System.out.println(ex.getMessage());
      } finally {
        if (i == n - 1)
          sc.close();
      }
    }

    for (CustomerVIP x : listCustomer) {
      System.out.println(x.toString());
    }
    Collections.sort(listCustomer, new SortByRank());

    for (CustomerVIP x : listCustomer) {
      System.out.println(x.toString());
    }
  }
}
