import java.sql.SQLOutput;
import java.util.Scanner;

import static java.lang.System.out;

public class If_else_statement {
    public static void main(String[] args) {
        System.out.println("Hom nay ban gap ai: ");
        Scanner sc = new Scanner(System.in);
        String ten;
        ten = sc.nextLine();
        System.out.println("Hom nay thoi tiet the nao: ");
        String thoitiet;
        thoitiet = sc.nextLine();
        if (ten.equals("truong") & thoitiet.equals("sunny")) {
            System.out.println("Di choi game nhe!");
        } else if (ten.equals("tam")) {
            System.out.println("Di an com nhe!");
        } else if (thoitiet.equals("rainy")) {
            System.out.println("Di ve nha nhe!");
        }
    }
}
