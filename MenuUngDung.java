import java.util.Scanner;

public class MenuUngDung {
    public static void main(String[] args) {
        System.out.println("1. Ve hinh tam giac");
        System.out.println("2. Ve hinh vuong");
        System.out.println("3. Ve hinh chu nhat");
        System.out.println("0. Exit");
        System.out.println("Moi nguoi dung chon menu: ");
        Scanner sc = new Scanner(System.in);
        while (true){
            int menu = sc.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Ve hinh tam giac:");
                    System.out.println("*****");
                    System.out.println("****");
                    System.out.println("***");
                    System.out.println("**");
                    break;
                case 2:
                    System.out.println("Ve hinh vuong: ");
                    System.out.println("*****");
                    System.out.println("*****");
                    System.out.println("*****");
                    System.out.println("*****");
                    System.out.println("*****");
                    break;
                case 3:
                    System.out.println("Ve hinh chu nhat: ");
                    System.out.println("**********");
                    System.out.println("**********");
                    System.out.println("**********");
                    break;
                case 0:
                    System.exit(0);
                    default:
                        System.out.println("Khong lua chon...!!!");
                        break;
            }
        }
    }

}
