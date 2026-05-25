import java.util.Scanner;
import java.util.InputMismatchException;
public class TrapDis {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter trap code");
        try{
            int code =  scanner.nextInt();
            System.out.println("trap disarmed:"+code);
        }catch (InputMismatchException e){
            System.out.println("invalid trap code!");
        }
        scanner.close();


    }
}
