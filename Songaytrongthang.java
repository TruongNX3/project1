import java.util.Scanner;

public class Songaytrongthang {
    public static void main(String[] args) {
        System.out.println("Nhap vao thang muon kiem tra: ");
        Scanner sc = new Scanner(System.in);
        byte thang = sc.nextByte();
        switch (thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                System.out.printf("Thang" + thang + "co 31 ngay!");
                break;
            case 2:
                System.out.printf("Thang" + thang + "co 28 hoac 29 ngay!");
                break;
            default:
                System.out.printf("Thang" + thang + "co 30 ngay!");
        }
    }
}
