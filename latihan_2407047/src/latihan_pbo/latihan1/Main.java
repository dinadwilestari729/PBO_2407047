package latihan_pbo.latihan1;

class Cafe{
    String nama;
    String alamat;

    Cafe(String nama, String alamat){
    this.nama = nama;
    this.alamat = alamat;
    System.out.println(nama);
    System.out.println(alamat);
    }
 
    // method
    void buka(){
    System.out.println("Cafe" + nama + "Sudah buka");
}
}

// constructor

public class Main {
    public static void main(String[] args) {

        // Cafe cafe1 = new Cafe();
        Cafe cafe4 = new Cafe( "Dina Cafe",  "Bandung");
        cafe4.buka();
        // cafe1.nama = "Zura Cafe";
        // cafe1.alamat = "Jakarta";

        // Cafe cafe2 = new Cafe();
        // cafe2.nama = "Papabou";
        // cafe2.alamat = "Indramayu";

        // Cafe cafe3 = new Cafe();
        // cafe3.nama = "Kopi Kenangan";
        // cafe3.alamat = "Indramayu";

        // System.out.println("Nama Cafenya adalah : " + cafe1.nama);
        // System.out.println("Alamatnya ada di : " + cafe1.alamat);

        // System.out.println("Nama Cafenya adalah : " + cafe2.nama);
        // System.out.println("Alamatnya ada di : " + cafe2.alamat);

        // System.out.println("Nama Cafenya adalah : " + cafe3.nama);
        // System.out.println("Alamatnya ada di : " + cafe3.alamat);
        
    }
}