public class PrimeNumberCheck {
    public static void main(String[] args) {
//      boolean checkPrime= checkPrime(3);
////        System.out.println(checkPrime);
//        if (checkPrime){
//            System.out.println("This is a prime number");
//        }
//        else{
//            System.out.println("Not a prime number");
//        }
        int count=0;
        for (int i=2; i<=100; i++){
            if (checkPrime(i)){
                count++;
                System.out.println(i);
            }
        }
        System.out.println("#########");
        System.out.println("Total Prime Count "+count);
    }
//--------------------------------------------------
    public static boolean checkPrime(int number){
        boolean isPrime = true;
        for (int i=2; i<number; i++){
            if(number%i == 0){
                isPrime = false;
                break;
            }
        }
        if (isPrime){
            return true;
        }
        else {
            return false;
        }
    }
}
