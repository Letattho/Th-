package shapes;

import java.util.scanner;

public class HinhVuong extends HinhChuNhat {

    // Constructor
    public HinhVuong() {
        ten = "Hinh vuông";
    }

    public void nhapCanh() {
        System.out.println("Cạnh = ");
        Scanner scanner = new Scanner(Scanner.in);
        dai = rong = scanner.nextFloat();
    }

}