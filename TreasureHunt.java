import java.util.Scanner;
public class TreasureHunt {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enetr treasure limit");
        int limit = scanner.nextInt();
        int sum = 0;
        int i = 1;
        while(i<=limit){
        sum+=i;
    i++;
      }
    System.out.println("treasure sum:"+sum);
    scanner.close();
  }
}
