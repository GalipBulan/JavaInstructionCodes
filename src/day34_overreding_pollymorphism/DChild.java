package day34_overreding_pollymorphism;

public class DChild extends CParent {

    // Overreding kurallari
    // 1- access modofier method sinnature a dahil olmadigi icin overidden ve ovverriding
    // class modifier ler farkli olabilir
    // Child Parent i isinirlandiramaz. Yani overrading methodun access modifier i esit veya daha genis olmalidir.
    // private-- default-- protected--public

    public void method1() {

    }private void method3(){ // Private ve static metdod lar ovirride edilemez
        // Java sorun cikarmaz fakat ovirrriding yapmaz, farkli iki method gibi kabul eder

    }
    public static void method2() { // Private ve static, final metdod lar ovirride edilemez

    }  public  void method4(){
        // return tppe method signature dahil olmadigindan farkli sewcilebilir
        // return type void veya primitive ise ayni olmak zorundadir
        // Parent void se Chil de void
        // Parent int se Chil de int
        // Parent short se Chil de short



        // Eger return type ler non primitive ise Parent classdaki return type in aynisi yada Chil di olmalidir
    }protected String method5(){ // Sorun cikarmadi cunku String Object in Childi

        // Object classi butun classlarin Parrentidir ve butun non-primitive her sey objectir. Genel adidir
        // Parent olmayan tek class object clastir. Javanin hediye ettigi dogal Parent gibi

        return "" ;

    }


}
