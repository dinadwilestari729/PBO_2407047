package latihan_pbo.latihan1.latihan_pbo.latihan6;

public abstract class BangunDatar {
    private String nama;

    public BangunDatar (String nama) {
        this.nama = nama;
    }

    // abstract methode
    abstract double hitungLuas();
    abstract double hitungKeliling();


    public void Display() {
        System.out.println("Ini adalah: " + nama);
    }
}