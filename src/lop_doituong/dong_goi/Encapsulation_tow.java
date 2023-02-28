package lop_doituong.dong_goi;

public class Encapsulation_tow {
    public static void main(String[] args) {
        Encapsulation_one pjoect=new Encapsulation_one();
        pjoect.setName("trung");
        pjoect.setHeight(1.6f);
        pjoect.setAge(20);
        pjoect.setEmail("@gmail.com");
        System.out.println("tên của bạn là : " + " " + pjoect.getName());
        System.out.println("chiều cao của bạn là : " + " " +pjoect.getHeight() );
        System.out.println("tuổi của bạn là :" + " " + pjoect.getAge() );
        System.out.println("your address is : " + " " + pjoect.getEmail());
    }
}
