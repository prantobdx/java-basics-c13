public class TernaryIfElse {
    public static void main(String[] args) {
        int score = 30;
//        if(score>=40) {
//            System.out.println("You are passed");
//        }
//        else {
//            System.out.println("You are failed:");
//        }

        //-------------Ternary ex1--------------------
        String res = (score >= 40) ? "You are win" : "You are loss";
        System.out.println(res);

        //---------------Ternary ex2---------------
        int num1 = 10;
        int num2 = 20;
        int num3 = 15;
        int max = (num1 > num2)
                 ? (num1 > num3 ? num1 : num3)
                 : (num2 > num3 ? num2 : num3);

        System.out.println("The maximum of the three numbers is: " + max);

    }
}
