package BKTTH_02.Bai1AndBai3;

import java.util.Comparator;

public class SortByProductName implements Comparator <MobilePhone> {
	@Override
	public int compare(MobilePhone o1, MobilePhone o2) {
		return o1.getTenSanPham().compareTo(o2.getTenSanPham());
	}
}
