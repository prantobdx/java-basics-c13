import java.util.Scanner;

public class User_Input {
    public static void main(String[] args) {

        //-------Take String From User---------
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Input your name:\n");
//        String name = scanner.nextLine();
//        System.out.println("your name is " + name + "\n");

//-----------Take Number From User-------------
        try {
            System.out.println("Input Integer num1");
            int num1 = scanner.nextInt();
            System.out.println("The First Number is " + num1 + "\n");

            System.out.println("Input Double num2:");
            double num2 = scanner.nextDouble();
            System.out.println("The Second Number is " + num2 + "\n");

            double sum = num1 + num2;
//      String str = sum + "";
//      String str = String.valueOf(sum);
//      String str = Double.toString(sum);
            System.out.println("So, The Sum is " + sum + "\n");

            scanner.close();
        } catch (Exception ex) {
            System.out.println("Please input integer value in num1");
            System.out.println(ex);
        }
//------final is optional --------
        finally {
            System.out.println("Program is end");
        }
    }
}
