import java.util.Scanner;

public class Nam_nhuan {
    public static void main(String[] args) {
        System.out.println("Nhap vao nam can kiem tra: ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("La nam nhuan!");
                } else {
                    System.out.println("Khong la nam nhuan!");
                }
            } else {
                System.out.println("La nam nhuan!");
            }
        } else {
            System.out.println("Khong la nam nhuan!");
        }
    }
}
