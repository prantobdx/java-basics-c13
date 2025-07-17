import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number (1-3): ");
        int choice = scan.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Selected option is 1");
                break;
            case 2:
                System.out.println("Selected option is 2");
                break;
            case 3:
                System.out.println("Selected option is 3");
                break;

            default:
                System.out.println("invalid choice.");
        }

    }
}
