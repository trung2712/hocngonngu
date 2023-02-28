package lop_doituong;

public class inheritance_one_two {
    public static void main(String[] args) {
        inheritance project = new inheritance();
        System.out.println("your full name is :"+ " " + project.fullname);
        System.out.println("your height is :" + " " + project.height);
        System.out.println("your address is :" + " " + project.email);
        System.out.println("your age is : " + " " + project.age);
        project.year();
    }
}
