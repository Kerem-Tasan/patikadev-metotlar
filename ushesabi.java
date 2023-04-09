import java.util.Scanner;

public class ushesabi {

    static int power(int a, int b) {
        if (b == 0)
            return 1;
        else if (a == 1) {
            return a;
        }

        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kuvveti girin:");
        int a = input.nextInt();
        System.out.print("Tabanı girin:");
        int b = input.nextInt();
        power(a, b);
        System.out.println(power(a, b));
    }
}
