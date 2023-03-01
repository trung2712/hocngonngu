package lop_doituong.dong_goi;

public class Encapsulation_tow {
    public static void main(String[] args) {
        Encapsulation_one project = new Encapsulation_one();
        project.setFullname("Hoàng Quốc Trung");
        project.setEmail("@gmail.com");
        project.setAge(20);
        project.setHeight(1.7f);
        System.out.println("your full name is :" + "  " + project.getFullname());
        System.out.println("your address is : "  +" " +project.getEmail());
        System.out.println("your height is : " + " " + project.getHeight());
        System.out.println("your age is :" + "  " + project.getAge());
    }
}
