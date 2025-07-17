public class MathFunctions {
    public static void main(String[] args) {

        //        System.out.println(Math.random());
        double randNumber = generateRandomNumber(10, 99);
        double maxNumber = getMaxNumber(50.6, 70.8);
        int sqrRootValue = getMaxNumber(49);

        System.out.println("This is an auto generated Number: " + randNumber);
        AnotherRandomNumber();
        System.out.println("Get the max value number: " + maxNumber);
        System.out.println("The square root value is: " + sqrRootValue);
        nearestValue(7.5);
    }

    public static int generateRandomNumber(int min, int max) {
        double rand = Math.random() * (max - min) + min;
        int randNum = (int) rand;
        return randNum;
    }

    //-----------------Works--------------------------
    //Example:
    public static void AnotherRandomNumber() {
        int maxRange, minRange;
        minRange = 10;
        maxRange = 1000;
        double a = Math.random();
        int randomNumber = (int) (minRange + a * (maxRange - minRange));
        System.out.println("This Another Random Number: " + randomNumber);
    }

    public static double getMaxNumber(double val1, double val2) {
        double maxValue = Math.max(val1, val2);
        return maxValue;
    }

    public static int getMaxNumber(int val) {
        double sqrRoot = Math.sqrt(val);
        int Value = (int) sqrRoot;
        return Value;
    }

    public static void nearestValue(double num) {
        long rounded = Math.round(num);
        System.out.println("Rounded value of" + num + "is:" + rounded);

    }
}
