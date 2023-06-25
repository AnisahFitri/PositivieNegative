import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sebuah bilangan: ");
        int number = input.nextInt();

        String result = (number >= 0) ? "positif" : "negatif";
        System.out.println("Bilangan tersebut adalah " + result);
    }
}