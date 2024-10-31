//Author: MAIY 07!!
package BKTTH_01.Bai3;

public class LopCLC extends Lop {
    @Override
    public boolean kiemTraSoLuongHocSinh() {
        return super.kiemTraSoLuongHocSinh() && super.soLuongHocSinh >= 20;
    }
}
