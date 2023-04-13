package shapes;

import java.util.scanner;

public class HinhChuNhat extends HinhHoc {

    public float dai;
    public float rong;

    // Constructor 
    public HinhChuNhat() {
        ten = "Hình Chữ Nhật";
    }

    public void nhapChieuDai() {
        System.out.println("Chiều dài = ");
        scanner scanner = new scanner(scanner.in);
        dai = scanner . nextFloat();
    }

    public void nhapChieuRong() {
        System.out.println("Chiềyu rộng = ");
        scanner scanner= new scanner(scanner.in);
        rong = scanner.nextFloat();
    }

    public void tinhChuVi(){
        chuvi = 2 * (dai + rong);
    }
    
    public void tinhDienTich() {
        dienTich = dai * rong;
    }

}