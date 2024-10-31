//Author: MAIY 07!!
package BKTTH_01.Bai2;

public class ChuHo {
    private String hoTen;
    private String soDienThoai;
    private String soNha;
    private String maSoDongHo;

    public ChuHo() {}
    
    public ChuHo(String hoTen, String soDienThoai, String soNha, String maSoDongHo) {
        this.hoTen = hoTen;
        this.soDienThoai = soDienThoai;
        this.soNha = soNha;
        this.maSoDongHo = maSoDongHo;
    }

    public String getHoTen() {
        return this.hoTen;
    }

    public String getSoDienThoai() {
        return this.soDienThoai;
    }

    public String getSoNha() {
        return this.soNha;
    }

    public String getMaSoDongHo() {
        return this.maSoDongHo;
    }

    @Override
    public String toString() {
        return "Ho ten: " + this.hoTen + "\nSo dien thoai: " + this.soDienThoai +
               "\nSo nha: " + this.soNha + "\nMa so dong ho: " + this.maSoDongHo;
    }
}
