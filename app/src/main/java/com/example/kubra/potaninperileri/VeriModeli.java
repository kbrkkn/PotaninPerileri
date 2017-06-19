package com.example.kubra.potaninperileri;
public class VeriModeli {
   private String isim,dogumTarihi;
    private int fotoId,kulubId,boy,kilo;
    public VeriModeli(String isim, String dogumTarihi, int boy, int kilo, int fotoId, int kulubId) {
        this.isim = isim;
        this.dogumTarihi = dogumTarihi;
        this.boy = boy;
        this.kilo = kilo;
        this.fotoId = fotoId;
        this.kulubId = kulubId;
    }
    public String getIsim() {return isim;}
    public void setIsim(String isim) {this.isim = isim;}

    public String getDogumTarihi() {return dogumTarihi;}
    public void setDogumTarihi(String dogumTarihi) {this.dogumTarihi = dogumTarihi;}

    public int getBoy() {return boy;}
    public void setBoy(int boy) {this.boy = boy;}

    public int getKilo() {return kilo;}
    public void setKilo(int kilo) {this.kilo = kilo;}

    public int getFotoId() {return fotoId;}
    public void setFotoId(int fotoId) {this.fotoId = fotoId;}

    public int getKulubId() {return kulubId;}
    public void setKulubId(int kulubId) {this.kulubId = this.kulubId;
    }
}
