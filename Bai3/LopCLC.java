//Author: MAIY 07!!
//Created: 30.09.2024
package Bai3;

public class LopCLC extends Lop {
    @Override
    public boolean kiemTraSoLuongHocSinh() {
        return super.kiemTraSoLuongHocSinh() && super.soLuongHocSinh >= 20;
    }
}
