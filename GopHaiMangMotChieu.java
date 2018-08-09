import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class GopHaiMangMotChieu {
    public static void main(String[] args) {
        //Khoi tao hai mang 1 chieu

        int[] array1 = new int[10];
        int[] array2 = new int[10];
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int j = 0;
        //Nhap vao phan tu cho mang thu 1

        System.out.println("Nhap nhan tu mang 1: ");
        do {
            System.out.print("Nhap vao phan tu thu " + (j + 1) + ": ");
            array1[j] = sc.nextInt();
            j++;
        } while (j < 10);
        //Nhap vao phan tu cho mang thu 2

        System.out.println("Nhap nhan tu mang 2: ");
        do {
            System.out.print("Nhap vao phan tu thu " + (i + 1) + ": ");
            array2[i] = sc.nextInt();
            i++;
        } while (i < 10);
        //In ra 2 mang da nhap

        System.out.print("Mang 1: ");
        for (i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + "\t");
        }
        System.out.println();
        System.out.print("Mang 2: ");
        for (i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + "\t");
        }
        //Gop hai mang

        int[] array3 = new int[20];
        for (i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        for (i = 0; i < array2.length; i++) {
            array3[10 + i] = array2[i];
        }
        //In ra mang gop

        System.out.println();
        System.out.println("Mang gop la: ");
        for (i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + "\t");
        }
    }
}
