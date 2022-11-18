package day39_abstractClass;

public abstract class Araba {

    // Araba class'ını inherit eden tüm class'lar
    // motor, kasa ve tekerlek, marka  metodlarını override etmek zorunda kalsın
    //Ancak abs, klima method'ları opsiyonel olsun
    // isteyen child bu method'ları override etsin isteyen override etmesin

    public abstract void motor();

    public abstract void marka();
    public abstract void kasa();
    public abstract void tekerlek();

    public void abs(){
        System.out.println("Guvenlik arttirmak isteyen arabalar klima kullanmali");
    }
    public void klima(){
        System.out.println("Konfor arttirmak isteyen arabalar klima kullanmali");

    }

}
