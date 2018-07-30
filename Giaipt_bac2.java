import java.util.Scanner;

class Giaipt_bac2 {
    public static void main(String[] args) {
        //Giai phuong trinh bac 2

        System.out.print("Nhap vao he so a: ");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        System.out.print("Nhap vao he so b: ");
        double b = sc.nextDouble();
        System.out.print("Nhap vao he so c: ");
        double c = sc.nextDouble();
        double x, x1, x2, delta;
        if (a == 0) {
            x = -c / a;
            System.out.println("\n");
            System.out.printf("Phuong trinh co nghiem la: %.2f ", x);
        } else {
            delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("-------------------------------------------------------");
                System.out.println("Phuong trinh vo nghiem nhe!");
            } else if (delta == 0) {
                x = -b / 2 * a;
                System.out.println("-------------------------------------------------------");
                System.out.printf("Phuong trinh co nghiem duy nhat la: %.2f", x);
            } else {
                x1 = (-b + Math.sqrt(Math.abs(delta))) / 2 * a;
                x2 = (-b - Math.sqrt(Math.abs(delta))) / 2 * a;
                System.out.println("-------------------------------------------------------");
                System.out.printf("Phuong trinh co hai nghiem la: x1= %.2f, x2= %.2f", x1, x2);
                System.out.println("\n");
            }
        }
    }
}

