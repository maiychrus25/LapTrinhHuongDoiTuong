package Bai14;

import java.time.LocalTime;
import java.util.Scanner;

public class CuocHen {
    private String maCuocHen;
    private LocalTime thoiGianBatDau;
    protected LocalTime thoiGianKetThuc;

    public CuocHen () {}
    
    public CuocHen(String maCuocHen, LocalTime thoiGianBatDau, LocalTime thoiGianKetThuc) {
		this.maCuocHen = maCuocHen;
		this.thoiGianBatDau = thoiGianBatDau;
		this.thoiGianKetThuc = thoiGianKetThuc;
	}

	public void input(Scanner sc) {
        System.out.print("Nhap ma cuoc hen: ");
        this.maCuocHen = sc.nextLine();

        System.out.print("Nhap thoi gian bat dau (hh:mm): ");
        this.thoiGianBatDau = LocalTime.parse(sc.nextLine());

        System.out.print("Nhap thoi gian ket thuc (hh:mm): ");
        this.thoiGianKetThuc = LocalTime.parse(sc.nextLine());
    }
    
    public void isValidThoiGian() throws InvalidTimeException  {
        if (!thoiGianKetThuc.isAfter(thoiGianBatDau)) {
            throw new InvalidTimeException ("Thoi gian ket thuc phai lon hon thoi gian bat dau!");
        }
    }
    
    @Override
    public String toString() {
    	return "Ma cuoc hen: " + this.maCuocHen + "\nThoi gian bat dau: " + this.thoiGianBatDau
    			+ "\nThoi gian ket thuc: " + this.thoiGianKetThuc;
    }
}
