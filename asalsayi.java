import java.util.Scanner;

public class asalsayi {

    static void isPerfect(int a) {
        int sayac = 0;
        for (int i = 1; i <= a; i++) {

            if (a % i == 0) {
                sayac++;
            }

        }
        if (sayac == 2)
            System.out.println(a + " sayısı asaldır");

        else
            System.out.println(a + " sayısı asal değildir");
if(a<=0 ){
    System.out.println("Girdiğiniz sayı 1'den büyük olmalıdır.");
    
}
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Sayı girin:");
        int a = input.nextInt();
        isPerfect(a);
    }
}
