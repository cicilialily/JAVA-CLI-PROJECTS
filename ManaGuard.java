import java.util.Scanner;

public class ManaGuard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter mana level:");
        int mana = scanner.nextInt();
        assert mana >= 0 : "Mana cannot be negative!";
        System.out.println("Mana level: " + mana);
        scanner.close();
    }
}