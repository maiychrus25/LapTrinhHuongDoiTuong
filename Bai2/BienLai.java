//Author: MAIY 07!!
//Created: 29.09.2024
package Bai2;

public class BienLai {
    private ChuHo chuHo;
    private int chiSoCu;
    private int chiSoMoi;

    public BienLai() {
    }

    public BienLai(ChuHo chuHo, int chiSoCu, int chiSoMoi) {
        this.chuHo = chuHo;
        this.chiSoCu = chiSoCu;
        this.chiSoMoi = chiSoMoi;
    }

    public int tinhTienNuoc() {
        return (this.chiSoMoi - this.chiSoCu) * 25000;
    }

    @Override
    public String toString() {
        return "Chỉ Số Cũ: " + this.chiSoCu + "\nChỉ Số Mới: " + this.chiSoMoi
                + "\nTiền Nước Phải Trả: " + this.tinhTienNuoc() + " VND";
    }
}
