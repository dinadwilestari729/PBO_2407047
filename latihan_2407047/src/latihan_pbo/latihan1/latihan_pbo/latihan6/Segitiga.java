package latihan_pbo.latihan1.latihan_pbo.latihan6;

public class Segitiga extends BangunDatar {
    private double alas, tinggi;
    private double sisi;

    public Segitiga (double alas, double tinggi, double sisi) {
        super("Segitiga");
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi = sisi;
    }

    @Override
    double hitungLuas(){
        return 0.5  * alas * tinggi;
    }

    @Override
    double hitungKeliling(){
        return sisi;
    }
}
