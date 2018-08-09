import java.util.Scanner;

public class DaoNguocCacPhanTuCuaMang {
    public static void main(String[] args) {
        int[] numbers;
        int size;
        Scanner sc = new Scanner(System.in);
        //Nhap vao kich thuoc mang

        do {
            System.out.println("Nhap vao kich thuoc mang: ");
            size = sc.nextInt();
            if (size > 30) {
                System.out.println("So phan tu phai nho hon 30!");
            }
        } while (size > 30);
        //Khoi tao mang

        numbers = new int[size];
        //Nhap vao cac phan tu cua mang
        boolean check;
        int index = 0;
        do {
            System.out.println("Nhap vao phan tu thu " + (index + 1) + ": ");
            numbers[index] = sc.nextInt();
            index++;
        } while (index < numbers.length);
        //Hien thi mang da nhap

        System.out.println("Mang da nhap la: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + "\t");
        }
        //Dao nguoc cac phan tu cua mang

        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[size - 1 - i];
            numbers[size - 1 - i] = temp;
        }
        System.out.println();
        System.out.println("Mang dau khi dao nguoc la: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + "\t");
        }
    }
}
