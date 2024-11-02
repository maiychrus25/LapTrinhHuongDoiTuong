package Bai8;

import java.util.Comparator;

public class SortByRank implements Comparator<CustomerVIP> {
  @Override
  public int compare(CustomerVIP o1, CustomerVIP o2) {
    return o2.getVipRank() - o1.getVipRank();
  }
}