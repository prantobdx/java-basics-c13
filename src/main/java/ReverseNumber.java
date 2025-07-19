public class ReverseNumber {
    public static void main(String[] args) {
        int number= 1234;
        int reverse= 0;
        while (number!=0){
             int reminder= number%10;
             number= number/10;
            reverse= reverse*10+reminder;
        }
        System.out.println(reverse);
    }
}
