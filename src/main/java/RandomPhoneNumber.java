public class RandomPhoneNumber {
    public static void main(String[] args) {
        int maxRange, minRange;
        minRange = 10000000;
        maxRange = 99999999;
        double a = Math.random();
        int randomNumber = (int) (minRange + a * (maxRange - minRange));
        //String concatination
        String phoneNum = "017" + randomNumber;
        System.out.println(phoneNum);

    }
}
