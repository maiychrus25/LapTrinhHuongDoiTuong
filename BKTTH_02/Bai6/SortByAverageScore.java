// package BKTTH_02.Bai6;

import java.util.Comparator;

public class SortByAverageScore implements Comparator<HighSchoolStudent> {
  public int compare(HighSchoolStudent o1, HighSchoolStudent o2) {
    return Double.compare(o2.calcAverageScoree(), o1.calcAverageScoree());
  }
}