package model;

public class SachMuon {
    private int maS, maBd;
    private int soluong;
    public SachMuon(int maS, int maBd, int soluong) {
        this.maS = maS;
        this.maBd = maBd;
        this.soluong = soluong;
    }
    public int getMaS() {
        return maS;
    }
    public void setMaS(int maS) {
        this.maS = maS;
    }
    public int getMaBd() {
        return maBd;
    }
    public void setMaBd(int maBd) {
        this.maBd = maBd;
    }
    public int getSoluong() {
        return soluong;
    }
    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

}
