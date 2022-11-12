package day34_overreding_pollymorphism;

public class BChild extends AParent{

    public void method1() {  // Overriddinn Method (Gecersiz kilan metdod)

        System.out.println("Child class method1");

        // Overriding Parent ve Child classlari arasindadir. Ayni classda olmaz
        // Overreding miras iliskisi olan iki class arasinda olur
        // Overreding tamaemen parent child arasinadk iliskidir. Kardes classlarda yapilamaz
        // Overriding onceki classlarda kullanilan methotlari aptane(gecersiz) eder
        // Overriding sadece methodlarda gecerlidir ve methodun en guncel halini getirir
    }
    public void method2 (int a){   // Burada overriding yok cunku varable ayni degil
        // Overreding olabilmesi icin hem method ismi hem de method signature ayni olmalidir

        System.out.println("Child class method2");

    }
    public void method2(String isim){  // isim olan parametre ismi onemli degil, parametre turu onemlidir.

        System.out.println("Child class String parametreli method1");

    }
    @Override // Java otomatik olusursa @@Override ifadesi koyar
    // @Override  kullanilmayan ovirriding isleminde parent class daki
    // overridden methodu silinirse hic bir sorun olaz.
    // Ancak @Override kullanilan ovviridding isleminde parent classdaki overrriding method silinirse
    // jaca CTE verir: Boylece overriding method un silinmesi engellenir

    public void method3() {  // Code-Genarete-Ovirride metthods kisaca da yapilabilir

        // Otomatik olusturmak icin maus bu classda olamlidir
        // super.method3(); Iki methodu da calistirir ilk olarak Parent sonra Child classi calistirir.
        // O yuzden bunu burada tutmak uygun degildir.
        // Overridden ve ovarreding varsa methodlardan sadece birisi calisir
        // Eger ikisini de calistirmak istersek super.overridenMethodIsmi yazilir

    }
}
