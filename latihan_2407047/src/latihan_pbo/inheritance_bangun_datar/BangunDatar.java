package latihan_pbo.inheritance_bangun_datar;

public class BangunDatar {

    public double getSisi(){
        return sisi;
    }
    // PERSEGI
    private double sisi;

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double luasPersegi() {
        return sisi * sisi;
    }

    public double kelilingPersegi() {
        return 4 * sisi;
    }
    public double kelilingPersegiPanjang() {
        return 2 * sisi;
    }

    // PERSEGI PANJANG
    private double panjang;
    private double lebar;

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double getPanjang(){
        return panjang;
    }

    public double getLebar(){
        return lebar;
    }

    // public double luasPersegiPanjang() {
    //     return panjang * lebar;
    // }

    // public double kelilingPersegiPanjang() {
    //     return 2 * (panjang + lebar);
    // }

    // SEGITIGA
    private double alas;
    private double tinggi;
    private double sisi1;
    private double sisi2;
    private double sisi3;

    public void setAlas(double alas) {
        this.alas = alas;
    }
    public double getalas() {
        return alas;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    public double gettinggi() {
        return tinggi;
    }

    public double getsisi1() {
        return sisi1;
    }
    public double getsisi2() {
        return sisi2;
    }
    
    public double getsisi3() {
        return sisi3;
    }

    public void setluasSegitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public void setkelilingSegitiga(double s1, double s2, double s3) {
        this.sisi1 = s1;
        this.sisi2 = s2;
        this.sisi3 = s3;

    }

    // BELAH KETUPAT
    private double diagonal1;
    private double diagonal2;
    private double sisiBelahKetupat;

    public void setDiagonal1(double diagonal1) {
        this.diagonal1 = diagonal1;
    }
    public double getdiagonal1 () {
        return diagonal1;
    }

    public void setDiagonal2(double diagonal2) {
        this.diagonal2 = diagonal2;
    }
    public double getdiagonal2() {
        return diagonal2;
    }
    public void setLuasBelahKetupat(double diagonal1, double diagonal2) {
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }
    public void setSisiBelahKetupat(double sisiBelahKetupat) {
        this.sisiBelahKetupat = sisiBelahKetupat;
    }
    public double getsisiBelahKetupat() {
        return sisiBelahKetupat;
    }

    public double luasBelahKetupat(double diagonal1, double diagonal2) {
        return 0.5 * diagonal1 * diagonal2;
    }

    public double kelilingBelahKetupat() {
        return 4 * sisiBelahKetupat;
    }
}