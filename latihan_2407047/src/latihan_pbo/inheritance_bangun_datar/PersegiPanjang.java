package latihan_pbo.inheritance_bangun_datar;

public class PersegiPanjang extends BangunDatar {

    public double luasPersegiPanjang(){
        return getPanjang() * getLebar();
    }
    public double kelilingPersegiPanjang(){
        return 2 * (getPanjang() + getLebar());
    }
    
}
