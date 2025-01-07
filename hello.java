import java.util.Scanner;
public class hello{
    
    public static void main(String[] args) {
        // nhập tên và điểm . hiển thị ra
        Scanner scanner= new Scanner(System.in);
        System.out.println(" teen cua sinh vien la : ");
        String name = Scanner.nextLine();
        System.out.println("nhap diem sv");
        int a= scanner.nextInt();

        System.out.println("ten sinh vien la "+name+"ddieemr sinh vien la "+a);


    }
}