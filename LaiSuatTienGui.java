import java.util.Scanner;

public class LaiSuatTienGui {
    public static void main(String[] args) {
        //Bai toan tien gui ngan hang

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so tien can gui: ");
        double tienGui = sc.nextDouble();
        System.out.println("Cac muc lai suat theo ki han la: ");
        System.out.println("1 thang----0.5%/nam");
        System.out.println("3 thang----0.6%/nam");
        System.out.println("6 thang----0.7%/nam");
        System.out.println("12 thang---0.8%/nam");
        System.out.println("Nhap vao so thang muon gui: ");
        while (true) {
            int thangGui = sc.nextInt();
            switch (thangGui) {
                case 1:
                    double laiSuat1 = 0.5;
                    System.out.printf("Lai suat 1 thang la: %.2f", laiSuat1);
                    System.out.println("\n");
                    double tienLai1 = tienGui * (laiSuat1 / 12) * 1;
                    System.out.printf(" So tien lai duoc nhan la: %.2f", tienLai1);
                    break;
                case 3:
                    double laiSuat3 = 0.6;
                    System.out.printf("Lai suat 1 thang la: %.2f", laiSuat3);
                    System.out.println("\n");
                    double tienlai3= tienGui * (laiSuat3 / 12) * 3;
                    System.out.printf(" So tien lai duoc nhan la: %.2f", tienlai3);
                    break;
                case 6:
                    double laiSuat6 = 0.7;
                    System.out.printf("Lai suat 1 thang la: %.2f", laiSuat6);
                    System.out.println("\n");
                    double tienLai6 = tienGui * (laiSuat6 / 12) * 6;
                    System.out.printf(" So tien lai duoc nhan la: %.2f", tienLai6);
                    break;
                case 12:
                    double laiSuat12 = 0.8;
                    System.out.printf("Lai suat 1 thang la: %.2f", laiSuat12);
                    System.out.println("\n");
                    double tienLai12 = tienGui * (laiSuat12 / 12) * 12;
                    System.out.printf("So tien lai duoc nhan la: %.2f", tienLai12);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Truong hop khong hop le...!!!");
            }
        }
    }
}
