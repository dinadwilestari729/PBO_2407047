package latihan_pbo.latihan5_polymorphism;

public class MenuItem extends Menu {
    private int jumlah;

    public MenuItem(String nama, double harga, int jumlah) {
        super(nama, harga);
        this.jumlah = jumlah;
    }

    public int getJumlah() {
        return jumlah;
    }

    @Override
    public double hitungTotal() {
        return getHarga() * jumlah;
    }

    @Override
    public void tampilkanHasil() {
        System.out.println(getNama() + " x" + jumlah 
                + " = " + hitungTotal());
    }
}
