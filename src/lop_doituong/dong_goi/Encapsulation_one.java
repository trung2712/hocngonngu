package lop_doituong.dong_goi;

public class Encapsulation_one {
private String fullname;
private String Email;
private int age ;
private float height;

    public String getFullname() {
        return fullname;
    }
    public void setFullname(String fname){
        this.fullname=fname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
}

