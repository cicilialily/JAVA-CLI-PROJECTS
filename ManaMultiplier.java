import java.util.Scanner;

public class ManaMultiplier {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter mana level:");
        int mana = scanner.nextInt();

        System.out.println("Multiplied Mana: " + square(mana));

        scanner.close();
    }

    public static int square(int n) {
        return n * n;
    }
}