import java.util.Scanner;

public class vonglapwhile {
    public static void main(String[] args) {
        int number, sum = 0;
        Scanner repeat = new Scanner(System.in);
        while (sum<150) {
            System.out.println("nhập vào số nguyên bất kì :");
            number= repeat.nextInt();
            sum +=number;
        }
        System.out.println("tổng các sô nguyên vừa nhập ="+ sum);
    }
}
