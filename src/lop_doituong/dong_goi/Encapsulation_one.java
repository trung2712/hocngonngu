package lop_doituong.dong_goi;

public class Encapsulation_one {
 private String name;
 private  String email;
 private int  age;
 private float height;

 public float getHeight() {
  return height;
 }
 public void setHeight(float height) {
  this.height = height;
 }

 public int getAge() {
  return age;
 }
 public void setAge(int age) {
  this.age = age;
 }

 public String getEmail() {
  return email;
 }
 public void setEmail(String email) {
  this.email = email;
 }

 public String getName(){
  return name;
 }
 public void setName(String name){
  this.name=name;
 }
}
