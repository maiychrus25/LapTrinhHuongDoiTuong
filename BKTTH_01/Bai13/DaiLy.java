<<<<<<< HEAD:BKTTH_01/Bai13/DaiLy.java
//Author: MAIY 07!!
package BKTTH_01.Bai13;
=======
// Created 10/10/2024
// Author: MAIY07!!
package Bai13;
>>>>>>> b66927e00c624d9e9bcda4bbf71cb7ec11f24165:Bai13/DaiLy.java

import java.util.Scanner;

public class DaiLy {
    protected String maDaiLy;
    private String tenDaiLy;
    private String diaChi;
    
    public DaiLy () {}
    
    public DaiLy(String maDaiLy, String tenDaiLy, String diaChi) {
    	this.maDaiLy = maDaiLy;
    	this.tenDaiLy = tenDaiLy;
    	this.diaChi = diaChi;
    }

    public void input(Scanner sc) {
        System.out.print("Nhap ma dai ly: ");
        this.maDaiLy = sc.nextLine();

        System.out.print("Nhap ten dai ly: ");
        this.tenDaiLy = sc.nextLine();

        System.out.print("Nhap dia chi: ");
        this.diaChi = sc.nextLine();
    }

    public void isValidMaDaiLy() throws InvalidMaDaiLyException {
        if (maDaiLy.startsWith("DL")) 
        	throw new InvalidMaDaiLyException("Ma dai ly phai bat dau la DL!");
    }
    
    @Override
    public String toString() {
    	return "Ma dai ly: " + this.maDaiLy + "\nTen dai ly: " + this.tenDaiLy 
    			+ "\nDia chi: " + this.diaChi;
    }
}
