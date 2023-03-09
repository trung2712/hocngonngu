package lop_doituong.Abstraction;

 abstract public class Abstraction {
     public abstract void Absttraction1();
     public void slepp(){
         System.out.println("kkkkkk");
     }
 }
 class Dog extends Abstraction{
     public void Absttraction1(){
         System.out.println("the Dog says : gogogogo" );
     }
 }
 class main{
     public static void main(String[] args) {
         Dog project = new Dog();
         project.Absttraction1();
         project.slepp();
     }
 }
