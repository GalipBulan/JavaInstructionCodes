package day23_constructor;

public class HAraba {

    String marka="Marka belirtilmedi";
    String model="Model belirtilmedi";
    String yakit;
    int yil;
    int fiyat;



    public HAraba (String mrk, String mdl, String ykt, int yl, int fyt){

        marka=mrk;
        model=mdl;
        yakit=ykt;
        yil=yl;
        fiyat=fyt;

    }

    public HAraba(String mrk, String mdl,int yl ){

        // Istersek paremetleri azaltarak da constructor olusturabiliriz.

        marka=mrk;
        model=mdl;
        yil=yl;

    }

    // Biz gozle gorunur herhangi bir constructor olusturdugumzda java default olani siler
    // Bu durumda daha onve olusturulmus oznelerin sorun olmamasi icin class a
    // parametresiz bir constructor eklemek faydali olur

    public HAraba() {
        // Gorunur durumdaki parametresiz constroctor default constructor degildir
        // Bir class da gozle gorunen bir constructor varsa default bir constructor yoktur.
        // Bu sebeple icine deger atilmayan default bir constructor olusturmamiz gerekir.

    }


    public String toString() {
        return "Araba Ozellikleri " +
                "\nmarka : " + marka +
                "\nmodel : " + model +
                "\nyakit : " + yakit +
                "\nyil : " + yil +
                "\nfiyat : " + fiyat ;
    }
    public int maxHiz(String yakit){
        int maxHiz=120;
        if(yakit.equalsIgnoreCase("dizel")){
            maxHiz=200;
        } else if (yakit.equalsIgnoreCase("benzin")) {
            maxHiz=230;
        } else if (yakit.equalsIgnoreCase("elektrikli")) {
            maxHiz=180;
        }
        return maxHiz;
    }



}
