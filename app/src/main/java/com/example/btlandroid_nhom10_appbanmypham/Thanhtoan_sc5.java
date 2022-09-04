package com.example.btlandroid_nhom10_appbanmypham;

public class Thanhtoan_sc5 {
    private String ho;
    private String ten;
    private int sdt;
    private String tinh;
    private String quan;
    private String phuong;
    private String diachi;

    public Thanhtoan_sc5() {
    }

    public Thanhtoan_sc5(String ho, String ten, int sdt, String tinh, String quan, String phuong, String diachi) {
        this.ho = ho;
        this.ten = ten;
        this.sdt = sdt;
        this.tinh = tinh;
        this.quan = quan;
        this.phuong = phuong;
        this.diachi = diachi;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSdt() {
        return sdt;
    }

    public void setSdt(int sdt) {
        this.sdt = sdt;
    }

    public String getTinh() {
        return tinh;
    }

    public void setTinh(String tinh) {
        this.tinh = tinh;
    }

    public String getQuan() {
        return quan;
    }

    public void setQuan(String quan) {
        this.quan = quan;
    }

    public String getPhuong() {
        return phuong;
    }

    public void setPhuong(String phuong) {
        this.phuong = phuong;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    @Override
    public String toString() {
        return "Thanhtoan{" +
                "ho='" + ho + '\'' +
                ", ten='" + ten + '\'' +
                ", sdt=" + sdt +
                ", tinh='" + tinh + '\'' +
                ", quan='" + quan + '\'' +
                ", phuong='" + phuong + '\'' +
                ", diachi='" + diachi + '\'' +
                '}';
    }
}
