package lop_doituong.Polymorphism;


class animals{
    public void animalSound(){
        System.out.println("The animal makes a sound");
    }
}
class Dog extends animals{
    public void animalSound(){
        System.out.println("the dog says : gogogogo  ");
    }
}
class Cat extends animals{
    public void animalSound(){
        System.out.println("the cat says : meo meo meo meo");
    }
}
class Pig extends animals{
    public void animalSound(){
        System.out.println("the pig says : we we we we");
    }
}
class  animalss{
    public static void main(String[] args) {
        animals myanimals = new animals();
        animals myDog = new Dog();
        animals myCat = new Cat();
        animals myPig = new Pig();
        myanimals.animalSound();
        myDog.animalSound();
        myCat.animalSound();
        myPig.animalSound();
    }
}
