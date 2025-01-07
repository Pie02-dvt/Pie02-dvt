// ax+b=0.
import java.util.Scanner;
public class bai1ptb2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao so a");
        int a= scanner.nextInt();
        System.out.println(" nhap gia tri cua b");
        int b= scanner.nextInt();
        int x;
        if(a==0 && b==0){
            System.out.println("phuong trinh co vo so nghiem");
        }
        else if (a>0){
            System.out.println("phuong trinh vo nghiem");
        }
        else{
            x=-b/a;
            System.out.println("gia tri cua x la "+x);
        }



    }
    
}
