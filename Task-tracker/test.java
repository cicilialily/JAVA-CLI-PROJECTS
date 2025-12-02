import java.util.Scanner;
class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String adjective1;

        System.out.println("Enter an adjective (discription): ");
        adjective1 = scanner.nextLine();
        System.out.println("Today I went out to a "+ adjective1 + "zoo");

        scanner.close();
    }
}