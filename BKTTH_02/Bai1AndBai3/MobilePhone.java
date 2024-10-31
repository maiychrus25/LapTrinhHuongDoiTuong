package BKTTH_02.Bai1AndBai3;

import java.util.Scanner;

public class MobilePhone extends Product {
	private String nhaSanXuat;
	private String thoiGianBaoHanh;
	
	public MobilePhone() {}
	
	public MobilePhone(String tenSanPham, int giaThanh, int soLuong, String nhaSanXuat, String thoiGianBaoHanh) {
		super(tenSanPham, giaThanh, soLuong);
		this.nhaSanXuat = nhaSanXuat;
		this.thoiGianBaoHanh = thoiGianBaoHanh;
	}
	
	@Override
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("Nhap ten nha san xuat: ");
		this.nhaSanXuat = sc.nextLine();
		
		System.out.print("Nhap thoi gian bao hanh(YY:MM:DD): ");
		this.thoiGianBaoHanh = sc.nextLine();
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nNha san xuat: " + this.nhaSanXuat + "\nThoi gian bao hanh: " + this.thoiGianBaoHanh;
	}
}
