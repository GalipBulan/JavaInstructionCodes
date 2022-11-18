package day39_abstractClass;

public class CHondaCivic extends BHonda {
    @Override
    public void motor() {
        System.out.println("Honda civic araclar vtec teknoloji motor kullanir");
    }
    @Override
    public void kasa() {
        System.out.println("Honda civic araclar sedan veya hb kasa kullanir");

    }
    @Override
    public void tekerlek() {
        System.out.println("Honda civic araclar 205 55 16 teker kullanir");

    }
    @Override
    public void yakit() {
        System.out.println("Honda civic araclar benzinli veya dizel olabilir");

    }
    @Override
    public void guvenlik() {
        System.out.println("Honda civic araclar yuksek guvenlik standartlarina sahiptir");

    }

    @Override
    public void abs() {
        System.out.println("Honda civic arabalar abs kullanir");
    }

    @Override
    public void klima() {
        System.out.println("Honda civic arabalar standart olarak klimalidirlar");
    }

    public static void main(String[] args) {
        CHondaCivic civic1=new CHondaCivic();

        civic1.abs();
        civic1.klima();
        civic1.marka();
        civic1.ozelTeknoloji();
        civic1.motor();
    }
}
