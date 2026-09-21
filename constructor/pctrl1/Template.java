package pctrl1;

public class Template {
     public int id;
    public String name;
    public int age;
    public int grade;
    public Template(int id, String name, int age, int grade) {
this.id = id;
this.name = name;
this.age = age;
this.grade = grade;
        System.out.println("Template class constructor");
   
    }
    public void  Bunk(){
        System.out.println(name + " is bunking class.");
    }
    public  void sleep(){
        System.out.println(name + " is sleeping in the  hostel.");
    }


}
