package Bai15;

import java.util.ArrayList;
import java.util.Scanner;

public class FoodManager {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = 0;
    while (n < 2 || n > 100) {
      try {
        System.out.print("Nhap vao so luong thuc pham dong lanh (2 <= n <= 100): ");
        n = Integer.parseInt(sc.nextLine());
      } catch (NumberFormatException ex) {
        System.out.println(ex.getMessage());
      }
    }
    ArrayList<FrozenFood> listFood = new ArrayList<>();

    for (int i = 0; i < n; ++i) {
      try {
        FrozenFood food = new FrozenFood();
        food.inputInfo(sc);

        food.isvalidateInfo();
        food.isvalidatePrice();

        listFood.add(food);

      } catch (NumberFormatException ex) {
        System.out.println(ex.getMessage());
      } catch (InvalidPriceException | InvalidNumberException ex) {
        System.out.println(ex.getMessage());
      } catch (Exception ex) {
        System.out.println(ex.getMessage());
      }
    }

    sc.close();
    boolean found = false;

    for (FrozenFood food : listFood) {
      if (food.getExpirationDate() >= 7) {
        found = true;
        System.out.println(food.toString());
      }
    }

    if (!found)
      System.out.println("Moi san pham deu con thoi han su dung duoi 7 ngay.");
  }
}
