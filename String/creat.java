 
 import java.util.Scanner;
 
 public class creat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the name :");
        
        String name="hello man";
        String caste="HeLlo";
        // System.out.println(name.charAt(3));
        // System.out.println(name);
        // System.out.println(name.length());
        // for (int i = 0; i < name.length(); i++) {
        //    System.out.println(name.charAt(i)); 
        // }
        // System.out.println("The name is "+name+" and caste is "+caste);

// System.out.println(name==caste);
// System.out.println(name.equals(caste));
// System.out.println(name.equalsIgnoreCase(caste));
// System.out.println(name.toUpperCase());
// System.out.println(name.contains("man"));
System.out.println(name.isBlank());
System.out.println(name.substring(2,4));
    }
}
