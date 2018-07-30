import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        //Phan mem tinh luong nhan vien
        System.out.println("Nhap vao so nam lam viec cua nhan vien: ");
        Scanner sc = new Scanner(System.in);
        float nam = sc.nextFloat();
        float salary;
        System.out.println("Nhap vao he so luong nhan vien: ");
        byte heSo = sc.nextByte();
        if (heSo >= 1 && heSo <= 5) {
            salary = heSo * 4000000 + nam * 500000;
            System.out.printf("Luong cua nhan vien la: %.2f", salary);
        }
    }
}
