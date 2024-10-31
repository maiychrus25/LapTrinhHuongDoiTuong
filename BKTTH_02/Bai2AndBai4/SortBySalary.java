package BKTTH_02.Bai2AndBai4;

import java.util.Comparator;

public class SortBySalary implements Comparator <EmployeeFullTime> {
	public int compare(EmployeeFullTime o1, EmployeeFullTime o2) {
		return Double.compare(o2.getSalary(), o1.getSalary());
	}
}
