import java.util.Scanner;

public class desenegore {
    static void minus(int a) {
        int temp = a;
        do {
            System.out.print(temp + " ");
            temp -= 5;

        } while (temp > -0);
        while (temp != (a + 5)) {
            System.out.print(temp + " ");
            temp += 5;
        }

        a = temp;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı girin:");
        int a = input.nextInt();
        int temp = a;
        minus(temp);

    }
}
