package latihan_pbo.inheritance_bangun_datar;

public class Main {
    public static void main(String[] args) {
        
        persegi p = new persegi();
        p.setSisi(8);

        System.out.println("Luas Persegi = " + p.luasPersegi());
        System.out.println("Keliling Persegi = " + p.kelilingPersegi());

        PersegiPanjang q = new PersegiPanjang();
        q.setPanjang(4);
        q.setLebar(6);

        System.out.println("Luas Persegi Panjang = " + q.luasPersegiPanjang());
        System.out.println("Keliling Persegi Panjang = " + q.kelilingPersegiPanjang());
    }
}
