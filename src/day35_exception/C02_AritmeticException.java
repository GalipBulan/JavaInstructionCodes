package day35_exception;

public class C02_AritmeticException {

    public static void main(String[] args) {

        // Verilen iki tamsayiyi birbirine bolup
        // sonucun tamsayi kismini yazdirin

        int sayi1=20;
        int sayi2=0;

        try {
            // riskli oldugunu ongordugumuz kodlar
            System.out.println(sayi1/sayi2); // 20 0 a bolunmez ve vurada Exception verir.
            System.out.println("Bakalim bu satir calisacak mi ?"); // Burasi yazmadi:Cunku ust satirda sorun buldu
            // Ve ectecption olustu.Exception bulunca catch bloguna kadar olan satirlari yok sayar.
            // Exception un yakalandigi catch bloguna gelince tekrar calismaya baslar.

        } catch (ArithmeticException e) {
            // catch (ArithmeticException e)  ongordugumuz risk
            System.out.println("Sayi sifira bolunemez");
            // catch(0 'den sonraki { } catch blogu denir
            // beklenen risk gerceklesirse calisacak kodlar

            // Sorun ile karsilasir. O sorun onceden ongoruldugu icin
            // biz Java ya yoluna devam et deriz.
            // Bu sebeple sorunsuz calisir.
        } try {
            // Try su kodu calistirmayi dene demektir. Sorun cikma ihtimali olan yerlerde  try kullaniriz
            System.out.println("ali");
        } catch (Exception e) {
            System.out.println("Ozel isimler buyuk harfle baslar.");
        }

        /*
          Bazi exception'lar if else ile handle edilebilir ancak
          tum exception'lar icin if else yeterli olmaz.
         */

        // Java bir sorunla karsilasir ve onlem alinmazsa strops execution(calismayi durdurur)
        // ver throws excepetion verin (excepetion firlatir)

    }


}
