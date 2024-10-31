package BKTTH_02.Bai1AndBai3;

import java.util.Scanner;

public class Product {
	private String tenSanPham;
	private int giaThanh;
	private int soLuong;
	
	public Product () {}
	
	public Product(String tenSanPham, int giaThanh, int soLuong) {
		this.tenSanPham = tenSanPham;
		this.giaThanh = giaThanh;
		this.soLuong = soLuong;
	}
	
	public String getTenSanPham() {
		return this.tenSanPham;
	}
	
	public int getGiaThanh() {
		return this.giaThanh;
	}
	
	public void nhapThongTin(Scanner sc) {
		System.out.print("Nhap ten san pham: ");
		this.tenSanPham = sc.nextLine();
		
		System.out.print("Nhap gia thanh: ");
		this.giaThanh = Integer.parseInt(sc.nextLine());
		
		System.out.print("Nhap so luong: ");
		this.soLuong = Integer.parseInt(sc.nextLine());
	}
	
	// method check input is valid with price and quantity
	public void isValidatePriceAndQuantity() throws InvalidPriceOrQuantityException {
		if (this.giaThanh < 0) 
			throw new InvalidPriceOrQuantityException("Gia thanh khong hop le.");
		
		if (this.soLuong < 0) 
			throw new InvalidPriceOrQuantityException("So luong khong hop le.");
	}
	
	@Override
	public String toString() {
		return "Ten san pham: " + this.tenSanPham + "\nGia thanh: " + this.giaThanh + "\nSo luong: " + this.soLuong;
	}
}
