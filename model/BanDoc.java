package model;

import java.util.Scanner;

public class BanDoc {
    private static int id = 10000;
    private int maBD;
    private String hoTen, diaChi, SDT, loaiBD;
    public BanDoc() {}
    public BanDoc( String hoTen, String diaChi, String SDT,  String loaiBD) {
        this.maBD = id++;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.SDT = SDT;
        this.loaiBD = loaiBD;
    }

    public static int getId() {
        return id;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public int getMaBD() {
        return maBD;
    }

    public void setMaBD(int maBD) {
        this.maBD = maBD;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    public String getSDT() {
        return SDT;
    }
    public void setSDT(String SDT) {
        this.SDT = SDT;
    }
    public String getHoTen() {
        return hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public String getLoaiBD() {
        return loaiBD;
    }
    public void setLoaiBD(String loaiBD) {
        this.loaiBD = loaiBD;
    }

}
