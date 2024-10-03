package Bai18;

public class BienLaiGuiXe {
    public KhachGuiXe khachGuiXe;

    public BienLaiGuiXe () {}
    
    public BienLaiGuiXe(KhachGuiXe khachGuiXe) {
        this.khachGuiXe = khachGuiXe;
    }

    public double calculateAmount() {
        return khachGuiXe.getHours() * 20000;
    }

    @Override
    public String toString() {
    	return "Thong tin khach gui xe:\n" + this.khachGuiXe.toString() 
    			+ "\nSo tien phai tra: " + this.calculateAmount();
    }
}
