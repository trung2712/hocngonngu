package lop_doituong.enumm;

import java.util.Scanner;

public class user_input {
    public static void main(String[] args) {
        Scanner myProject = new Scanner(System.in);
        System.out.println("Enter name,age,address and height  :");
        String name = myProject.nextLine();
        int age = myProject.nextInt();
        float height = myProject.nextFloat();
        System.out.println("your full name is :" + name);
        System.out.println("your age is :" + age);
        System.out.println("your height is : "  + height);
    }
}
