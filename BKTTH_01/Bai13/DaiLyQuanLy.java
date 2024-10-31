<<<<<<< HEAD:BKTTH_01/Bai13/DaiLyQuanLy.java
//Author: MAIY 07!!
package BKTTH_01.Bai13;
=======
// Created 10/10/2024
// Author: MAIY07!!
package Bai13;
>>>>>>> b66927e00c624d9e9bcda4bbf71cb7ec11f24165:Bai13/DaiLyQuanLy.java

public class DaiLyQuanLy extends DaiLy {
	public DaiLyQuanLy() {}
	
	public DaiLyQuanLy(String maDaiLy, String tenDaiLy, String diaChi) {
		super(maDaiLy, tenDaiLy, diaChi);
	}
	
    @Override
    public void isValidMaDaiLy() throws InvalidMaDaiLyException {
        if (!super.maDaiLy.matches("DL\\d{4}")) 
        	throw new InvalidMaDaiLyException("Vui long nhap ma dai ly dinh dang DLXXXX!");
    }
}
