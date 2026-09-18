import java.util.Scanner;

public class Factorial {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int m=1;
    System.out.println("Enter the number you want to find factor:");
    int f=sc.nextInt(); 
     int i=1;
    while (i<=f) {
        m=m*i;
        i++;
    }
    System.out.println("the factor upto " +f+ " is "+m);

}
}
