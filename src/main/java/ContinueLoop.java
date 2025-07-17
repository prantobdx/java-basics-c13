public class ContinueLoop {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            if (i == 4) {
//                continue;
                break;
            }
            System.out.println(i);
        }
//-------------------------
        char c = 'a';
        if (c >= 97 && c <= 123) {
            System.out.println("small Char");
        } else {
            System.out.println("Caps or Special Char");
        }

    }
}
