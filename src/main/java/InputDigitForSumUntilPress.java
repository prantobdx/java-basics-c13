import java.util.Scanner;

public class InputDigitForSumUntilPress {
    public static void main(String[] args) {
        int sum= 0 ;
        System.out.println("Input a number:");
        Scanner scanner= new Scanner(System.in);
        while (true){
            int num= scanner.nextInt();
            if(num==-1){
                System.out.println("Stopped");
                break;
            }
            sum+=num;
            System.out.println("Sum is: "+sum);
            System.out.println("Input new Number: ");
        }
    }
}
