package latihan_2407047.src.latihan_polymorphism;

public class Main {

    public static void main(String[] args) {

        BangunDatar bd = new BangunDatar(3,4);
        bd.tampilkan();

        BangunDatar p = new Persegi(5);
        p.tampilkan();

        BangunDatar pp = new PersegiPanjang(6,4);
        pp.tampilkan();

        BangunDatar s = new Segitiga(6,8);
        s.tampilkan();
    }
}