//Author: MAIY 07!!
package BKTTH_01.Bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            ChuHo[] hoDan = new ChuHo[2];
            for (int i = 0; i < 2; i++) {
                System.out.println("Nhap thong tin cho ho dan " + (i + 1) + ":");
                System.out.print("Ho ten: ");
                String hoTen = sc.nextLine();

                System.out.print("So dien thoai: ");
                String soDienThoai = sc.nextLine();

                System.out.print("So nha: ");
                String soNha = sc.nextLine();

                System.out.print("Ma so dong ho: ");
                String maSoDongHo = sc.nextLine();

                System.out.print("Chi so cu: ");
                int chiSoCu = Integer.parseInt(sc.nextLine());

                System.out.print("Chi so moi: ");
                int chiSoMoi = Integer.parseInt(sc.nextLine());

                hoDan[i] = new ChuHo(hoTen, soDienThoai, soNha, maSoDongHo);
                BienLai bienLai = new BienLai(hoDan[i], chiSoCu, chiSoMoi);
               
                System.out.println(bienLai.toString());
            }
        } 
        catch (NumberFormatException ex) {
            System.out.println("Vui long nhap so hop le cho chi so nuoc.");
        } 
        catch (Exception ex) {
            System.out.println("Loi: " + ex.getMessage());
        } 
        finally {
            sc.close();
        }
    }
}
