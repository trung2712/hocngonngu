import java.util.Scanner;

public class cautrucrenhanh {
    public static void main(String[] args) {
        int height;
        Scanner year = new Scanner (System.in);
        System.out.println("nhap vao so tuoi cua ban :");
        height= year.nextInt();
        if (height > 25){
            System.out.println("ban da du tuoi!!");
        }
        else {
            System.out.println("ban chưa du tuoi!!");
        }
    }
}
