package lop_doituong;

abstract public class inheritance_one {
    public  String fullname ="Hoàng Quốc Trung";
    public  int age = 20;
    public  float height = 1.7f;
    public abstract void  year();
}
class inheritance extends inheritance_one{
    public String email ="@gmail.com";

    @Override
    public void year() {
        System.out.println("studying all long day");
    }
}
