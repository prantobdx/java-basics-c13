public class FindFactorial {
    public static void main(String[] args) {
        FindFactorial factorialObj = new FindFactorial();
       int factorialResult = factorialObj.calculateFactorial(30);
        System.out.println("The total sum of factorial number is: "+factorialResult);
    }

 public int calculateFactorial(int number) {
    int fact = 1;
    for(int i=1; i<=number; i++ ){
        fact=fact*i;
    }
    return fact;
 }

}