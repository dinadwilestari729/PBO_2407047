package latihan_pbo.latihan5_polymorphism;

public class Menu {
    private String nama;
    private double harga;

    public Menu(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    // kasih implementasi default
    public double hitungTotal() {
        return 0; // default (nanti dioverride)
    }

    public void tampilkanHasil() {
        System.out.println("Menu: " + nama);
    }
}