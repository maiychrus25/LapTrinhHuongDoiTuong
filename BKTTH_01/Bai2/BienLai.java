//Author: MAIY 07!!
package BKTTH_01.Bai2;

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
        return chuHo.toString() + "\n" + "Chỉ Số Cũ: " + this.chiSoCu + "\nChỉ Số Mới: " + this.chiSoMoi
                + "\nTiền Nước Phải Trả: " + this.tinhTienNuoc() + " VND";
    }
}
