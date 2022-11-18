package day39_abstractClass;

public abstract class BHonda extends Araba {

    /*
        Abstract parent class'lardaki abstract method'lar
        concrete child class'lar tarafından mecburen override edilir

        Ancak abstract parent'lardaki concrate method'ları override etmek mecburi değildir
        Eger Chıld class'a uyarlamak isterseniz override edebilirsiniz
        veya override etmeyip parent classs'daki haliyle kullanabilirsiniz.
         */


    public void marka() {
        System.out.println("Honda araclar bircok markaya sahiptir");

    }
    public abstract void yakit();


    public abstract void guvenlik();

    public void ozelTeknoloji(){

        System.out.println("Honda araclar standart guvenlik seceneklerine sahiptir");
    }

    {


    }

}
