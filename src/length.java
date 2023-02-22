import java.util.Scanner;

public class length {
    public static void main(String[] args) {
      String chuoi ;
      int doDai;
      Scanner length = new Scanner(System.in);
      System.out.println("nhập vào kí tự cần nhập!!");
      chuoi = length.nextLine();
      doDai = chuoi.length();
      System.out.println("kí tự in ra " + chuoi + " co do dai la =  " + doDai);
    }
}
