package latihan_pbo.inheritance_bangun_datar;

public class persegi extends BangunDatar {

    public double LuasPersegi(){
        return getSisi()*getSisi();
    }
    public double kelilingPersegi(){
        return 4 * getSisi();
    }
    
}
