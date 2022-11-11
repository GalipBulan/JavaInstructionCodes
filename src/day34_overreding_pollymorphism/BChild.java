package day34_overreding_pollymorphism;

public class BChild extends AParent{

    public void method1() {
        System.out.println("Child class method1");

    }
    public void method2 (int a){   // Burada overriding yok
        System.out.println("Child class method2");

        // Overreding olabilmesi icin hem method ismi hem de method signature ayni olmalidir
        // Overriding Parent ve Child classlari arasindadir
    }
    public void method2(String isim){
        System.out.println("Child class String parametreli method1");

    }
    @Override
    public void method3() {
        // super.method3(); Iki methodu da calistirir ilk olarak Parent sonra Child classi calistirir
        // O yuzden bunu burada tutmak uygun degildir
    }
}
