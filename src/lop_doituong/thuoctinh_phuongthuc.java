package lop_doituong;

public class thuoctinh_phuongthuc {
    //static method
    static void mystatic() {
        System.out.println("Static methods can be called without creating objects");
    }
    //public method
    public void mypublic() {
        System.out.println("Public methods must be called by creating objects");
    }

    public static void main(String[] args) {
        mystatic();
        thuoctinh_phuongthuc myOjc = new thuoctinh_phuongthuc();
        myOjc.mypublic();
    }
}
