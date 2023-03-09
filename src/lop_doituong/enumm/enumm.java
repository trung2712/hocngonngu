package lop_doituong.enumm;

public class enumm {
    enum live{
        Address,
        project,
        homeworld
    }

    public static void main(String[] args) {
        live myclass = live.Address;
        switch (myclass){
            case Address :
                System.out.println("address live");
                break;
            case project:
                System.out.println("project live");
                break;
            case homeworld:
                System.out.println("homeworld live");
                break;
            default:System.out.println("no live");
        }
    }
}
