package lop_doituong;

 class inheritance_one_two {
     public static void main(String[] args) {
         inheritance_tow project = new inheritance_tow();
         System.out.println("fullname :" + "  " + project.fulname);
         System.out.println("your address email is  :"+ " " + project.Email);
         System.out.println("your height is"+ "  "+ project.height);
         System.out.println("your ages is" + " " + project.age);
         System.out.println("how much is this year ?" + "  "+ project.newyear);
         project.year ();
     }
}
