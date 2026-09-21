package Paramerter;

public class C  extends B{
    String mail;
    String look;
    public C(String name,int age,int marks,int id,String mail,String look){
        super(name,age, marks,id);
        this.mail=mail;
        this.look=look;
       
        
    
    }
     void show(){
            Detail();
        }
}
