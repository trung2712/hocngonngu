package lop_doituong;

abstract class inheritance_one {
    public String fulname = "HOÀNG QUỐC TRUNG";
    public String Email = "hoangtrung.com";
    public float height = 1.74f;
    public int age = 20 ;
    public abstract void year();
}
   class inheritance_tow extends inheritance_one {
    public int newyear = 2023;

       @Override
       public void year() {
           System.out.println("studing all  day long ");
       }
   }
