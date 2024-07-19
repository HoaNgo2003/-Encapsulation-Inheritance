package controller;

import model.BanDoc;
import model.Sach;
import model.SachMuon;

import java.util.Scanner;

public class QLSachMuon {
    private static BanDoc[] BD;
    private static Sach[] sach;
    private static int indexSach = 0;
    private static int indexBD = 0;
    private SachMuon[] Smuon;
    private static int indexSmuon = 0;
    private Scanner sc = new Scanner(System.in);
    public QLSachMuon() {
        BD = new BanDoc[1000];
        sach = new Sach[1000];
        Smuon = new SachMuon[1000];
    }
    public void nhapSach(){
        String tenS = sc.nextLine();
        String TG = sc.nextLine();
        String CN = sc.nextLine();
        int namXB = Integer.parseInt(sc.nextLine()) ;
        Sach s = new Sach(tenS, TG, CN, namXB);
        sach[indexSach++] = s;
    }
    public void nhapBD(){
        String hoTen = sc.nextLine();
        String diaChi = sc.nextLine();
        String SDT = sc.nextLine();
        String loai = sc.nextLine();
        BanDoc bd = new BanDoc(hoTen, diaChi, SDT, loai);
        BD[indexBD++] = bd;
    }
    public void inDsSach(){
        System.out.println("Danh sach cac dau sach:");
        for(int i = 0; i < indexSach; i++){
            System.out.println(sach[i].getMaS()+" "+sach[i].getTenS()+" "+sach[i].getTG()+" "+sach[i].getCN()+" "+sach[i].getNamXB());
        }
    }
    public BanDoc getBD(int maBD) {
        BanDoc bd = new BanDoc();
        for(int j = 0; j < indexBD; j++){
             if(BD[j].getMaBD() == maBD){

                 bd = BD[j];
             }
        }
        return bd;

    }
    public Sach getSach(int maSach) {
        Sach s = new Sach();
        for(int j = 0; j < indexSach; j++){
            if(sach[j].getMaS() == maSach){
                s = sach[j];
            }
        }
        return s;
    }
    public void inDSBD(){
        System.out.println("Danh sach cac ban doc:");
        for(int i = 0; i < indexBD; i++){
            System.out.println(BD[i].getMaBD()+" "+BD[i].getHoTen()+" "+BD[i].getDiaChi()+" "+BD[i].getSDT()+" "+BD[i].getLoaiBD());
        }
    }
    public void nhapSMuon(){
        int maS =  Integer.parseInt(sc.nextLine());
        int maBD =  Integer.parseInt(sc.nextLine());
        int soluong =  Integer.parseInt(sc.nextLine());
        boolean isExit = false;

        try {
            if(soluong > 3){
                throw new Error("Moi dau sach khong muon qua 3 cuon");
            }
            for(int i = 0; i < indexSmuon; i++){
                if(Smuon[i].getMaS()==maS && Smuon[i].getMaBd()==maBD){
                    throw new Error("Ma sach va ma ban doc da ton tai");
                }
            }
            for(int i = 0; i < indexSmuon; i++){
                int dem = 0;
                for(int j = 0; j < indexSmuon; j++){
                    if(Smuon[i].getMaBd()==Smuon[j].getMaBd()){
                        dem++;
                    }

                }
                if(dem > 5) throw new Error("Moi ban doc chi nen doc mot lan duy nhat");
            }
            SachMuon sm = new SachMuon(maS, maBD, soluong);
            Smuon[indexSmuon++] = sm;
        }catch (Error e){
            System.out.println(e);
        }

    }

    public void inSachMuon(){
        Sach s = new Sach();
        BanDoc bd = new BanDoc();
        for(int i = 0; i < indexSmuon; i++){
            s = getSach(Smuon[i].getMaS());
            bd = getBD(Smuon[i].getMaBd());
            System.out.println(bd.getHoTen()+" "+ s.getTenS()+" "+ Smuon[i].getSoluong());
        }

    }
    public void sapXepQLMSTheoTenBD(){
        for(int i = 0; i < indexSmuon-2; i++){
            BanDoc bd0 = getBD(Smuon[i].getMaBd());
            for(int j = i+1; j < indexSmuon-1; j++){
                BanDoc bd1 = getBD(Smuon[j].getMaBd());
                if(bd0.getHoTen().compareToIgnoreCase(bd1.getHoTen())> 0){
                    SachMuon tmp = Smuon[i];
                    Smuon[i] = Smuon[j];
                    Smuon[j] = tmp;
                }
            }
        }
    }
    public void sapXepQLMSTheoSoLuong(){
        for(int i = 0; i < indexSmuon-2; i++){
            for(int j = i+1; j < indexSmuon-1; j++){
                if(Smuon[i].getSoluong() < Smuon[j].getSoluong()){
                    SachMuon tmp = Smuon[i];
                    Smuon[i] = Smuon[j];
                    Smuon[j] = tmp;
                }
            }
        }
    }
    public void timkiemVaHienThiDSSachMuon(String tenBD){
        int maBd = 0;
        BanDoc bd = new BanDoc();
        for(int i = 0; i < indexSmuon; i++){
             bd = getBD(Smuon[i].getMaBd());
            if(bd.getHoTen().compareToIgnoreCase(tenBD)==0){
                maBd = bd.getMaBD();
                break;
            }
        }
        System.out.println("Ban doc "+ bd.getHoTen()+" da muon nhung cuon sach sau:");
        for(int i = 0; i < indexSmuon; i++){
            if(Smuon[i].getMaBd()==maBd){
                Sach s = getSach(Smuon[i].getMaS());
                System.out.println(s.getTenS()+" , so luong muon:"+Smuon[i].getSoluong());
            }
        }
    }


}
