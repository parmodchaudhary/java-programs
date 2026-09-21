package Paramerter;

public class Main {
    public static void main(String[] args) {
        C obj=new C("Pramod",22,89,1,"pkurmi","good");
        System.out.println(obj.name);
        System.out.println(obj.age);
        System.out.println(obj.marks);
        System.out.println(obj.mail);
        System.out.println(obj.look);
       obj.Detail();
    }
}
