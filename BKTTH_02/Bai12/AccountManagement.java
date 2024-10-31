package Bai12;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class AccountManagement {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = 0;
    while (n < 2 || n > 100) {
      try {
        System.out.print("Nhap so luong tai khoan (2 <= n <= 100): ");
        n = Integer.parseInt(sc.nextLine());
      } catch (NumberFormatException ex) {
        System.out.println(ex.getMessage());
      }
    }
    ArrayList<SavingAccount> listAccount = new ArrayList<>();

    for (int i = 0; i < n; ++i) {
      try {
        SavingAccount acc = new SavingAccount();
        acc.inputInfo(sc);

        acc.isvalidateRate();
        acc.isvalidateTerm();

        acc.isvalidateBallance();
        acc.isvalidateAccountInfo();

        listAccount.add(acc);
      } catch (NumberFormatException ex) {
        System.out.println(ex.getMessage());
      } catch (InvalidRateException | InvalidTermException ex) {
        System.out.println(ex.getMessage());
      } catch (InvalidBalanceException | EmptyInputException ex) {
        System.out.println(ex.getMessage());
      } catch (Exception ex) {
        System.out.print(ex.getMessage());
      } finally {
        if (i == n - 1)
          sc.close();
      }
    }

    Collections.sort(listAccount, new SortByBallance());
    for (SavingAccount sa : listAccount) {
      System.out.println(sa.toString());
    }
  }
}
