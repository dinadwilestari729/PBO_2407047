package latihan_pbo.inheritance_bangun_datar;

public class Main {
    public static void main(String[] args) {
        
        persegi p = new persegi();
        p.setSisi(5);

        System.out.println("Luas Persegi = " + p.luasPersegi());
        System.out.println("Keliling Persegi = " + p.kelilingPersegi());

        PersegiPanjang q = new PersegiPanjang();
        q.setPanjang(4);
        q.setLebar(6);

        System.out.println("Luas Persegi Panjang = " + q.luasPersegiPanjang());
        System.out.println("Keliling Persegi Panjang = " + q.kelilingPersegiPanjang());

        Segitiga s = new Segitiga();
        s.setAlas(8);
        s.setTinggi(6);
        s.setkelilingSegitiga(3,4,5);

        System.out.println("Luas Segitiga = "+ s.luasSegitiga());
        System.out.println("Keliling Segitiga = "+ s.kelilingSegitiga());

        BangunDatar bk = new BangunDatar();
        bk.setDiagonal1(10);
        bk.setDiagonal2(8);
        bk.setSisiBelahKetupat(5);

        System.out.println("Luas Belah Ketupat : " + bk.luasBelahKetupat(bk.getdiagonal1(), bk.getdiagonal2()));
        System.out.println("Keliling Belah Ketupat : " + bk.kelilingBelahKetupat());
    }
}
