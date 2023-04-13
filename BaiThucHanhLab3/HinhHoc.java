package shapes

import java . util.Scanner;

public class HinhTron xtends HinhHoc {

    public float banKinh;

    // Constructor
    public HinhTtron() {
        ten = "Hinh Tron";
    }

    public void nhapBankinh() {
        System.out.println("Ban kinh = ");
        Scanner scanner = new Scanner(System.in);
        banKinh = scanner.nẽtFloat();
    }

    public void tinhChuVi() {
        chuVi = 2 * PI * bankinh;
    }

    pulic void tinhDienTich() {
        dienTich = PI * bankinh * bankinh;
        
    }

}