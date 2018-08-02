import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        System.out.println("Chuong trinh kiem tra so nguyen to !!!");
        System.out.println("--------------------------------------");
        System.out.println("Nhap vao so muon kiem tra: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a == 0) {
            System.out.println("So 0 la so nguyen to!");
        } else {
            a = Math.abs(a);
            int i = 2;
            while (i < a) {
                a = a % i;
                i++;
                if (a != 0) {
                    System.out.println("La so nguyen to!");
                } else {
                    System.out.println("Khong la so nguyen to!");
                }
            }

        }
    }

}
