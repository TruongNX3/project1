import java.util.Scanner;

public class HienThiSinhVienThiDo {
    public static void main(String[] args) {

        int[] studentsPoits;
        int size;
        Scanner sc = new Scanner(System.in);
        //Nhap kich thuoc mang

        do {
            System.out.println("Nhap vao kich thuoc mang: ");
            size = sc.nextInt();
            if (size > 30) {
                System.out.println("So luong sinh vien toi da la 30!");
            }
        } while (size > 30);
        //Khoi tao mang

        studentsPoits = new int[size];

        //Nhap tung phan tu cua mang

        for (int i = 0; i < studentsPoits.length; i++) {
            System.out.print("Nhap vao diem cua sinh vien: ");
            studentsPoits[i] = sc.nextInt();
        }

        //Hien thi mang da nhap

        System.out.print("Mang da nhap la: ");
        for (int i = 0; i < studentsPoits.length; i++) {
            System.out.print(studentsPoits[i] + "\t ");
        }
        //Hien thi sinh vien co diem lon hon 5

        int count = 0;
        for (int i = 0; i < studentsPoits.length; i++) {
            if (studentsPoits[i] >= 5) {
                count++;
            }
        }
        System.out.println();
        System.out.println("So sinh vien lon hon 5 diem la: " + count);
    }
}
