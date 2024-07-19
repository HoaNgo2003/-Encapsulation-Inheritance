package model;

import java.util.Scanner;

public class Sach {
    private static int id=10000;
    private int maS;
    private String tenS, TG, CN;
    private int namXB;
    public Sach() {}
    public Sach( String tenS, String TG, String CN, int namXB) {
        this.maS = id++;
        this.tenS = tenS;
        this.TG = TG;
        this.CN = CN;
        this.namXB = namXB;
    }

    public String getCN() {
        return CN;
    }

    public void setCN(String CN) {
        this.CN = CN;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Sach.id = id;
    }

    public int getMaS() {
        return maS;
    }

    public void setMaS(int maS) {
        this.maS = maS;
    }

    public int getNamXB() {
        return namXB;
    }

    public void setNamXB(int namXB) {
        this.namXB = namXB;
    }

    public String getTenS() {
        return tenS;
    }

    public void setTenS(String tenS) {
        this.tenS = tenS;
    }

    public String getTG() {
        return TG;
    }

    public void setTG(String TG) {
        this.TG = TG;
    }
}
