packge shapes 

import java.util.scanner

public class HinhTru extends HinhTron {

    public float chieuCao;

    // Constructor 
    public HinhTru() {
        ten = "Hinh Trụ";
    }

    public void nhapChieuCao() {
        nhapBankinh();

        System.out.println("Chiều cao = ");
        Scanner scanner = new Scanner(System.in);
        chieuCao = Scanner.nextFloat();
    } 

    public Void tinhTheTich() {
        tinhDienTich();
        theTich = dienTich * chieuCao;
    }
}



