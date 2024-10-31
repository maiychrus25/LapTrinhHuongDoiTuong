//Author: MAIY 07!!
package BKTTH_01.Bai14;

import java.time.LocalTime;

public class CuocHenKhachHang extends CuocHen {
	public CuocHenKhachHang () {}
	
	public CuocHenKhachHang(String maCuocHen, LocalTime thoiGianBatDau, LocalTime thoiGianKetThuc) {
		super(maCuocHen, thoiGianBatDau, thoiGianKetThuc);
	}
	
    @Override
    public void isValidThoiGian() throws InvalidTimeException {
        super.isValidThoiGian();
        if (super.thoiGianKetThuc.isBefore(LocalTime.of(8, 0)) || super.thoiGianKetThuc.isAfter(LocalTime.of(17, 0))) {
            throw new InvalidTimeException("Thoi gian ket thuc phai nam trong khoang tu 8h den 17h!");
        }
    }
}
