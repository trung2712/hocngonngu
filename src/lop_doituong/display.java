package lop_doituong;

interface display {
    public void myothod ();
}
interface display2{
    public void myOtherThod();
}
class display3 implements display,display2{
    @Override
    public void myothod() {
        System.out.println("some text...");
    }

    @Override
    public void myOtherThod() {
        System.out.println("some other text...");
    }
}
class display4 {
    public static void main(String[] args) {
        display3 project = new display3();
        project.myothod();
        project.myOtherThod();
    }
}

