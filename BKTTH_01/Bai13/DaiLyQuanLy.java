//Author: MAIY 07!!
package BKTTH_01.Bai13;

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
