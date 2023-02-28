package lop_doituong;

public class tham_so {
    int happnewyear;
    String fullname;
    public tham_so (int year,String name){
        happnewyear = year;
        fullname = name;
    }

    public static void main(String[] args) {
        tham_so myproject = new tham_so(1956,"hoang quoc trung");
        System.out.println(myproject.fullname + "  " + myproject.happnewyear    );
    }

}
