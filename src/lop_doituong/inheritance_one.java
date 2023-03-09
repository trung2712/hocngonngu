package lop_doituong;

abstract public class inheritance_one {
    public String fullname = "hoàng quốc trung";
    public String email = " 64097gmail.com" ;
    public float height = 1.8f;

    public abstract void year();
}
    class inheritance extends inheritance_one{
        public int age = 20 ;

        @Override
        public void year() {
            System.out.println("happy new year...");
        }
    }

