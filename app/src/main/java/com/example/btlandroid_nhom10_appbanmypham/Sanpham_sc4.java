package com.example.btlandroid_nhom10_appbanmypham;

public class Sanpham_sc4 {
    private  String tenSoluong;
    private  String gia;
    private int hinh;

    public String tenSoluong() {
        return tenSoluong;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSoluong = tenSanPham;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }

    public Sanpham_sc4(String tenSoluong, String gia, int hinh) {
        this.tenSoluong = tenSoluong;
        this.gia = gia;
        this.hinh = hinh;
    }
}
