import java.util.Scanner;

public class LietKeSoNguyenTo {
    public static void main(String[] args) {
        int i;
        for (i = 2; i < 100; i++) {
            boolean SNT = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    SNT = false;
                    break;
                }
            }
            if (SNT == true)
                System.out.println(i);
        }
    }
}



