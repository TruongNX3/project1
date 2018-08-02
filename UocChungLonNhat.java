import java.util.Scanner;

public class UocChungLonNhat {
    public static void main(String[] args) {
        System.out.println("Nhap vao hai so tu nhien");
        System.out.println("------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so thu nhat: ");
        int a = sc.nextInt();
        System.out.println("Nhap vao soo thu hai: ");
        int b = sc.nextInt();
        if (a == 0 || b == 0) {
            System.out.println("Khong co uoc chung lon nhat.");
        } else {
            while (a != b) {
                a = Math.abs(a);
                b = Math.abs(b);
                if (a > b) {
                    a = a - b;
                    System.out.println("Uoc chung lon nhat cua hai so la: " + a);
                } else {
                    b = b - a;
                    System.out.println("Uoc chung lon nhat cua hai so la: " + b);
                }
            }
        }
    }
}
