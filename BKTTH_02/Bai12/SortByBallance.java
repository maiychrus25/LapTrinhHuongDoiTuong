package Bai12;

import java.util.Comparator;

public class SortByBallance implements Comparator<SavingAccount> {
  @Override
  public int compare(SavingAccount o1, SavingAccount o2) {
    return Double.compare(o2.getBallance(), o1.getBallance());
  }
}
