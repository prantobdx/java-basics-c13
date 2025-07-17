public class BasicJava {

    public static void main(String[] args) {

        System.out.println("Hello\nJava"); // print with new line
        System.out.println("Hello\tJava"); // print with one tab gap into word
        System.out.println("Hello\"Java\""); // Add clone with text
        System.out.println("Hello\\Java");  // Add backslash into text


        // Data Types:Storage [bit > byte > kilobyte > mb > gb > tera byte > peta byte > Exa byte > Zeta byte> Yotta byte]
        byte a= -128;
        //short b = 32768;
        // --------------------------------

        // big DataType cannot take into small Data type
        // Casting use for big value insert into small value
        int p = 50;
        double x = p;
        double z = 50;
        // int m = y;
        int l = (int) z;
        //--------------------------------

        //Parsing Use Converting into completely different data type.
        //Specially used for string. This can only be done when your string contains only digits.
        String num1 = "10";
        String num2 = "20";

        int num11 = Integer.parseInt(num1);
        int num22 = Integer.parseInt(num2);

        int sum = num11 + num22;

        System.out.println(sum);

        getNumber(String.valueOf(sum));
        //------------------------------------------
    }

    public static void getNumber(String num) {
        System.out.println(num);
    }
}
