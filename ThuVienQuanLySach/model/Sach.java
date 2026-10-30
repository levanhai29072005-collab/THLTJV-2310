package model;

import java.util.Scanner;

public class Sach {
    private String maSach;
    private String tenSach;
    private String tacGia;
    private int namXuatBan;
    private double donGia;
    private int soLuong;

    public Sach() {}

    public void nhapThongTin(Scanner sc) {
        System.out.print("Nhập mã sách: ");
        this.maSach = sc.nextLine();
        System.out.print("Nhập tên sách: ");
        this.tenSach = sc.nextLine();
        System.out.print("Nhập tác giả: ");
        this.tacGia = sc.nextLine();
        System.out.print("Nhập năm xuất bản: ");
        this.namXuatBan = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập đơn giá: ");
        this.donGia = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập số lượng: ");
        this.soLuong = Integer.parseInt(sc.nextLine());
    }

    public void hienThiThongTin() {
        System.out.println("----- THÔNG TIN SÁCH -----");
        System.out.println("Mã sách: " + maSach);
        System.out.println("Tên sách: " + tenSach);
        System.out.println("Tác giả: " + tacGia);
        System.out.println("Năm xuất bản: " + namXuatBan);
        System.out.println("Đơn giá: " + donGia);
        System.out.println("Số lượng: " + soLuong);
    }
    // Bài 2: Tính thành tiền = đơn giá * số lượng
    public double tinhThanhTien() {
        return this.donGia * this.soLuong;
    }
    // Bài 3: Phí vận chuyển = 5% giá trị sách
    public double tinhPhiVanChuyen() {
        return tinhThanhTien() * 0.05;
    }
}