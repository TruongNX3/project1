import java.util.Scanner;

public class S_hcn {
    public static void main(String[] args) {
        System.out.println("Nhap vao chieu rong: ");
        Scanner sc=new Scanner(System.in);
        float width;
        width=sc.nextFloat();
        System.out.println("Nhap vao chieu cao");
        float height;
        height=sc.nextFloat();
        float area;
        if(width<height){
            System.out.println("Ban da nhap sai roi!");
        } else{
            area=width*height;
            System.out.println("Dien tich hinh chu nhat la: "+ area);
        }
    }
}

