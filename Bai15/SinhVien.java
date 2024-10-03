package Bai15;

import java.util.Scanner;

public class SinhVien {
    private String maSinhVien;
    private String hoTen;
    protected double diemTrungBinh;
    
    public SinhVien () {}

    public SinhVien(String maSinhVien, String hoTen, double diemTrungBinh) {
		this.maSinhVien = maSinhVien;
		this.hoTen = hoTen;
		this.diemTrungBinh = diemTrungBinh;
	}

	public void input(Scanner sc) {
        System.out.print("Nhap ma sinh vien: ");
        this.maSinhVien = sc.nextLine();

        System.out.print("Nhap ho ten: ");
        this.hoTen = sc.nextLine();

        System.out.print("Nhap diem trung binh: ");
        this.diemTrungBinh = Double.parseDouble(sc.nextLine());
    }

	public void isValidateGpa() throws InvalidGradeException {
		if (this.diemTrungBinh < 0 || this.diemTrungBinh > 10) 
			throw new InvalidGradeException("Diem nhap khong hop le.");
	}
	
    public String isEligibleForScholarship() {
    	String status = "Ban duoc hoc bong.";
    	if (this.diemTrungBinh < 8.0) status = "Ban khong duoc hoc bong.";
    	return status;
    }
    
    @Override
    public String toString() {
        return "Ma sinh vien: " + this.maSinhVien +
               "\nHo ten: " + this.hoTen +
               "\nDiem trung binh: " + this.diemTrungBinh +
               "\nTinh trang hoc bong: " + isEligibleForScholarship();
    }
}
