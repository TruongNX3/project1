import java.util.Scanner;

public class UD_docso {
    public static void main(String[] args) {
        //Ung dung doc so trong khoang <1000

        System.out.print("Hay nhap vao so ban muon doc: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number >= 1000) {
            System.out.println("Vuot qua kha nang doc, moi nhap so nho hon 1000...!!!");
        }
        int number1 = number / 100;
        int phanDu = number % 100;
        int number2 = phanDu / 10;
        int number3 = phanDu % 10;
        System.out.println("----------------------------");
        switch (number1) {

            case 0:
                System.out.print(" ");
                break;
            case 1:
                System.out.print("Mot tram ");
                break;
            case 2:
                System.out.print("Hai tram ");
                break;
            case 3:
                System.out.print("Ba tram ");
                break;
            case 4:
                System.out.print("Bon tram ");
                break;
            case 5:
                System.out.print("Nam tram ");
                break;
            case 6:
                System.out.print("Sau tram ");
                break;
            case 7:
                System.out.print("Bay tram ");
                break;
            case 8:
                System.out.print("Tam tram ");
                break;
            case 9:
                System.out.print("Chin tram ");
                break;
        }
        switch (number2) {
            case 0:
                System.out.print("linh ");
                break;
            case 1:
                System.out.print("muoi ");
                break;
            case 2:
                System.out.print("hai muoi ");
                break;
            case 3:
                System.out.print("ba muoi ");
                break;
            case 4:
                System.out.print("bon muoi ");
                break;
            case 5:
                System.out.print("nam muoi ");
                break;
            case 6:
                System.out.print("sau muoi ");
                break;
            case 7:
                System.out.print("bay muoi ");
                break;
            case 8:
                System.out.print("tam muoi ");
                break;
            case 9:
                System.out.print("chin muoi ");
                break;
        }
        switch (number3) {
            case 0:
                System.out.print(" ");
                break;
            case 1:
                System.out.print("mot ");
                break;
            case 2:
                System.out.print("hai ");
                break;
            case 3:
                System.out.print("ba ");
                break;
            case 4:
                System.out.print("bon ");
                break;
            case 5:
                System.out.print("nam ");
                break;
            case 6:
                System.out.print("sau ");
                break;
            case 7:
                System.out.print("bay ");
                break;
            case 8:
                System.out.print("tam ");
                break;
            case 9:
                System.out.print("chin ");
                break;
        }
    }
}

