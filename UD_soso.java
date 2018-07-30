import java.util.Random;
import java.util.Scanner;

public class UD_soso {
    public static void main(String[] args) {
        //Ung dung so so

        int guessDigit1, guessDigit2;
        Random rd = new Random();
        int lottery = rd.nextInt(100);
        //Nhap so co 1 chu so tu 0-9

        System.out.print("Nhap vao so dau tien cua du doan: ");
        Scanner sc = new Scanner(System.in);
        guessDigit1 = sc.nextInt();
        //Nhap so co 1 chu so tu 0-9

        System.out.print("Nhap vao so thu hai cua du doan: ");
        guessDigit2 = sc.nextInt();
        System.out.printf("Giai dac biet la: %d", lottery);

        if ((guessDigit1 >= 0 && guessDigit1 <= 9) && (guessDigit2 >= 1 && guessDigit2 <= 9)) {
            //Lay so hang chuc cua giai dac biet

            int number1 = lottery / 10;
            //Lay so hang don vi cua giai dac biet

            int number2 = lottery % 10;
            if (guessDigit1 == number1) {
                if (guessDigit2 == number2) {
                    System.out.print("\n");
                    System.out.println("Trung giai dac biet!");
                } else {
                    System.out.print("\n");
                    System.out.println("Trung giai ba!");
                }
            } else {
                if (guessDigit2 == number2) {
                    System.out.print("\n");
                    System.out.println("Trung giai ba!");
                } else {
                    System.out.print("\n");
                    System.out.print("Ban khong trung giai, chuc ban may man lan sau! ");
                }
            }
            if (guessDigit1 == number2) {
                if (guessDigit2 == number1) {
                    System.out.print("\n");
                    System.out.println("Ban trung giai nhi!");
                }
            }
        } else {
            System.out.print("\n");
            System.out.println("So ban nhap khong hop le, Moi nhap lai.....!");
        }
    }
}


