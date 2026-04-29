package latihan_pbo.latihan5_polymorphism;

public class Main {
    public static void main(String[] args) {

        // polymorphism (tipe Menu, objek MenuItem)
        Menu item1 = new MenuItem("Ketoprak", 12000, 3);
        Menu item2 = new MenuItem("Nasi Goreng", 15000, 4);
        Menu item3 = new MenuItem("Soda Gembira", 8000, 5);
        Menu item4 = new MenuItem("Mie Ayam", 10000, 10);

        System.out.println("=== Daftar Pesanan ===");

        item1.tampilkanHasil();
        item2.tampilkanHasil();
        item3.tampilkanHasil();
        item4.tampilkanHasil();

        double totalSemua = item1.hitungTotal()
                          + item2.hitungTotal()
                          + item3.hitungTotal()
                          + item4.hitungTotal();

        System.out.println("----------------------");
        System.out.println("Total Bayar: " + totalSemua);
    }
}
