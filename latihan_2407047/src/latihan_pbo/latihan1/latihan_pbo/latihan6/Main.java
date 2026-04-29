package latihan_pbo.latihan1.latihan_pbo.latihan6;

public class Main {
    public static void main(String[] args) {
        BangunDatar[] bd = {
            new Persegi(6),
            new Segitiga(4, 6, 8)
        };

        for (BangunDatar b : bd) {
            b.Display();
            System.out.println("Luas: " + b.hitungLuas());
            System.out.println("Keliling: " + b.hitungKeliling());
            System.out.println("==================================");
        }
    }
}
