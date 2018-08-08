public class HienThi20SoNguyenToDauTien {
    public static void main(String[] args) {
        //Chuong trinh hien thi 20 so nguyen to dau tien
        System.out.println("Hien thi 20 so nguyen to dau tien: ");
        int count = 0;
        for (int i = 2; i < 1000; i++) {
            boolean soNguyenTo = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    soNguyenTo = false;
                    break;
                }
            }
            if (soNguyenTo && count <= 20) {
                System.out.print(i + " ");
                count++;
            }
        }
    }
}
