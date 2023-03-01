package lop_doituong.Polymorphism;

 class outerclass {
    int  x = 10 ;
    class  innerclass{
         public int y(){
             return x;
         }

    }
}
  class total {
     public static void main(String[] args) {
         outerclass myouter = new outerclass();
         outerclass.innerclass myinner = myouter.new innerclass();
         System.out.println(myinner.y());
     }
 }
