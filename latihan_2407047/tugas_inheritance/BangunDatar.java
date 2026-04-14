package latihan_2407047.tugas_inheritance;

public class BangunDatar {
    // atribut (enkapsulasi: private)
    private double panjang;
    private double lebar;

    // constructor
    public BangunDatar(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // getter
    public double getPanjang() {
        return panjang;
    }

    public double getLebar() {
        return lebar;
    }

    // method hitung luas
    public double hitungLuas() {
        return panjang * lebar *2;
    }

    public void tampilkanHasil(){
        System.out.println("Panjang: " + panjang);
        System.out.println("lebar = " + lebar);
    }
}
