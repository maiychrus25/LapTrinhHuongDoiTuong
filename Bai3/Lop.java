//Author: MAIY 07!!
//Created: 30.09.2024
package Bai3;

import java.util.Scanner;

public class Lop {
    private String maLop;
    private String tenLop;
    private String giangDuong;
    protected int soLuongHocSinh;
    private int soBanGhe;

    public Lop() {}

    public Lop(String maLop, String tenLop, String giangDuong, int soLuongHocSinh, int soBanGhe) {
        this.maLop = maLop;
        this.tenLop = tenLop;
        this.giangDuong = giangDuong;
        this.soLuongHocSinh = soLuongHocSinh;
        this.soBanGhe = soBanGhe;
    }

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma lop: ");
        maLop = sc.nextLine();

        System.out.print("Nhap ten lop: ");
        tenLop = sc.nextLine();

        System.out.print("Nhap giang duong: ");
        giangDuong = sc.nextLine();

        System.out.print("Nhap so luong hoc sinh: ");
        soLuongHocSinh = Integer.parseInt(sc.nextLine());

        System.out.print("Nhap so ban ghe: ");
        soBanGhe = Integer.parseInt(sc.nextLine());
    }

    public void hienThiThongTin() {
        System.out.println("Ma lop: " + maLop);
        System.out.println("Ten lop: " + tenLop);
        System.out.println("Giang duong: " + giangDuong);
        System.out.println("So luong hoc sinh: " + soLuongHocSinh);
        System.out.println("So ban ghe: " + soBanGhe);
    }

    public boolean kiemTraSoLuongHocSinh() {
        return soLuongHocSinh > 0;
    }
}
