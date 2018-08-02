import java.util.Scanner;

public class BMI_index {
    public static void main(String[] args) {
        System.out.println("Nhap vao can nang cua ban: ");
        Scanner sc=new Scanner(System.in);
        double height,weight,bmi;
        weight=sc.nextDouble();
        System.out.println("Nhap vao chieu cao cua ban: ");
        height=sc.nextDouble();
        bmi=weight/(height*height);
        if(bmi<18.5) System.out.println("underweight, BMI cua ban la: " + bmi);
        else {
            if((18.5<bmi)&&(bmi<25.0)) System.out.println("normal,BMI cua ban la: " + bmi);
            else {
                if((25<bmi)&&(bmi <30)) System.out.println("overweight,BMI cua ban la: "+ bmi);
                else {
                    System.out.println("osebe,BMI cua ban la: ");
                }
            }
        }
    }
}
