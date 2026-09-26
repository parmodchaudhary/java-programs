import java.util.ArrayList;

public class practise {
   public static void main(String[] args) {
     ArrayList<Integer>n1=new ArrayList<>();
    n1.add(34);
    n1.add(45);
    n1.add(56);
    n1.add(67);
    n1.add(78);
    n1.add(100);
    System.out.println(n1);
    n1.add(56);
    System.out.println(n1);
    n1.remove(1);
    n1.remove(0);
     System.out.println("the array n1:"+n1);
      ArrayList<Integer>n2=new ArrayList<>();
      n2.add(1);
      n2.add(2);
      n2.add(3);
      n2.add(4);
      n2.add(5);
       System.out.println("the array n2:"+n2);
       n1.addAll(n2);
System.out.println("The merge array element is : "+n1);
 System.out.println("the array n2:"+n1);
  System.out.println("the array n2:"+n2);

   }
   
}
