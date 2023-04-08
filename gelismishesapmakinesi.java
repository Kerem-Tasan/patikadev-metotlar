import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class gelismishesapmakinesi {

    static int sum(int a, int b) {
        int result = a + b;
        System.out.println("Toplam=" + result);
        return result;

    }

    static int minus(int a, int b) {
        int result = a - b;
        System.out.println("Fark=" + result);
        return result;
    }

    static int multi(int a, int b) {
        int result = a * b;
        System.out.println("Çarpım:" + result);
        return result;
    }

    static int division(int a, int b) {
        if (b == 0) {
            return 0;
        }
        int result = a / b;
        System.out.println("Bölüm:" + result);
        return result;
    }

    static int exp(int a, int b) {
        for (int i = 1; i < b; i++) {
            a *= a;
        }
        System.out.println("Sonuç=" + a);
        return a;
    }

    static int Mod(int a, int b) {
        int result = a % b;
        System.out.println("Mod:" + result);

        return result;
    }

    static void rectangle(int a, int b) {

        System.out.println("Çevre:" + (2 * (a + b)));
        System.out.println("Alanı:" + (a * b));

    }

    static void fact(int a) {
        
        int result = 1;
        for(int j=1;j<=a;j++){
            result*=j;
        }
        System.out.println(result);
       
    }

    // kodların başladığı yer
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int select;
        String menu = "1->Toplama\n" +
                "2 Çıkarma işlemi\n" +
                "3->Çarpma işlemi\n" +
                "4->Bölme işlemi\n" +
                "5->Üslü sayı hesaplama\n" +
                "6->Faktoriyel Hesaplama\n" +
                "7->Mod alma işlemi\n" +
                "8->Dikdörtgen alan ve çevre hesabı\n" +
                "0->Çıkış";
        System.out.println(menu);
        while (true) {

            System.out.print("Yapmak istediğiniz işlemi seçin:");

            select = inp.nextInt();
            if (select == 0) {
                break;

            }

            switch (select) {
                case 1:
                    // toplama
                    System.out.print("Birinci sayıyı=");
                    int a = inp.nextInt();
                    System.out.print("İkinci sayıyı=");
                    int b = inp.nextInt();

                    sum(a, b);
                    break;
                case 2:
                    // çıkarma
                    System.out.print("Birinci sayıyı=");
                    a = inp.nextInt();
                    System.out.print("İkinci sayıyı=");
                    b = inp.nextInt();

                    minus(a, b);
                    break;

                case 3:
                    // çarpım
                    System.out.print("Birinci sayıyı=");
                    a = inp.nextInt();
                    System.out.print("İkinci sayıyı=");
                    b = inp.nextInt();
                    multi(a, b);
                    break;

                case 4:
                    // bölüm
                    System.out.print("Birinci sayıyı=");
                    a = inp.nextInt();
                    System.out.print("İkinci sayıyı=");
                    b = inp.nextInt();
                    if (division(a, b) == 0) {
                        System.out.println("İkinci sayı 0 dan farklı olmalıdır.");
                    }
                    division(a, b);
                    break;

                case 5:
                    // üs alma
                    System.out.print("Birinci sayıyı=");
                    a = inp.nextInt();
                    System.out.print("İkinci sayıyı=");
                    b = inp.nextInt();
                    exp(a, b);
                    break;

                case 6:
                    // faktoriyel
                    System.out.print("Faktoriyeli bulunacak sayıyı girin=");
                    a = inp.nextInt();
                    fact(a);
                    break;

                case 7:
                    // mod alma
                    System.out.print("Birinci sayıyı=");
                    a = inp.nextInt();
                    System.out.print("İkinci sayıyı=");
                    b = inp.nextInt();
                    Mod(a, b);
                    break;

                case 8:
                    // Dikdörtgen
                    System.out.print("Kısa kenarı girin=");
                    a = inp.nextInt();
                    System.out.print("Uzun kenarı girin=");
                    b = inp.nextInt();
                    rectangle(a, b);
                    break;

                default:
                    System.out.println("Geçersiz komut.");
                    break;
            }
        }
        System.out.println("İyi günler...");
    }
}
