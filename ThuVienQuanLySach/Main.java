import java.util.Scanner;
import model.Sach;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sach sach = new Sach();

        System.out.println("=== NHẬP THÔNG TIN SÁCH ===");
        sach.nhapThongTin(sc);
        sach.hienThiThongTin();

        sc.close();
    }
}