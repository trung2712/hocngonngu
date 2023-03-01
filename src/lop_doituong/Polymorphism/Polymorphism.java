package lop_doituong.Polymorphism;

class Polymorphism {
 public void animal (){
     System.out.println("Here are some animal calls :");
 }
}
class Dog extends Polymorphism {
    @Override
    public void animal() {
        System.out.println("the Dog says : go go go go go" );
    }
}
class Pig extends Polymorphism{
    @Override
    public void animal() {
        System.out.println("the pig says : we we we we ");
    }
}
class cat extends Polymorphism{
    @Override
    public void animal() {
        System.out.println("the cat says :  meo meo meo" );
    }
}
class animal{
    public static void main(String[] args) {
        Polymorphism myanimal = new Polymorphism();
        Polymorphism myDog = new Dog();
        Polymorphism myPig = new Pig();
        Polymorphism mycat = new cat();
        myanimal.animal();
        myDog.animal();
        myPig.animal();
        mycat.animal();
    }

}
