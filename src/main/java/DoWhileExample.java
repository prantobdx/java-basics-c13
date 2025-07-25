import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {

        int sum=0;
        char ch;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Input a number: ");
            sum += scanner.nextInt();
            System.out.println("Sum is: "+sum);
            System.out.println("Do you want to continue?(y/n)");
            ch=scanner.next().charAt(0);

        }
        while(ch=='y');
    }
}
