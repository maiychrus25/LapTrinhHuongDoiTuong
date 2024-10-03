package Bai15;

public class SinhVienDuAn extends SinhVien {
    public SinhVienDuAn () {}
    
    public SinhVienDuAn(String maSinhVien, String hoTen, double diemTrungBinh) {
    	super(maSinhVien, hoTen, diemTrungBinh);
    }
    
    @Override
    public String isEligibleForScholarship() {
    	String status = "Ban dat hoc bong";
    	if (super.diemTrungBinh < 9.0) status = "Ban khong duoc hoc bong.";
    	return status;
    }
}
