package lop_doituong.Inheritance;
  class Inheritance {
    protected String car = "BNW;MOTO;BICYCLE";

    public void cars() {
        System.out.println("ford,ford !");
    }
}
class Car extends Inheritance{

        private int  money  = 2000 ;

        public static void main(String[] args) {
                Car project = new Car();
                project.cars();
                System.out.println("The price of these cars is about" + " " + project.car + " " + project.money + " dola" );
        }
 }


