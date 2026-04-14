package latihan_2407047.tugas_inheritance;

public class BangunRuang extends BangunDatar {
    private double tinggi;

    // constructor
    public BangunRuang(double panjang, double lebar, double tinggi) {
        super(panjang, lebar); // ambil dari parent
        // this.panjang = panjang;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungLuas(){
        return getPanjang() * getLebar();
    }
  
    // method hitung volume
    public double hitungVolume() {
        return super.hitungLuas() * tinggi; 
    }
    // methode hitung volume2
    public double hitungVolume2() {
        return hitungLuas() * tinggi; 
    }
    
    public void tampilkanInfoRuang(){
        super.tampilkanHasil();
        System.out.println("Tinggi : " + tinggi);
    }
}