 import java.util.Scanner;
public class FunCombination {
  public static int  facx(int n) {
   int e=1;
      for (int i=1; i <= n; i++) {
        e *= i;
      
      }
      return e;
    
    }
    
  public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
   System.out.println("Enter the value of n greater then r: ");
   int n = scanner.nextInt();
   System.out.println("enter your r"+n);
   int r = scanner.nextInt();

    
      
    
   int result = facx(n) / (facx(r) *facx(n - r) );
     System.out.println("The combination of " + n + " and " + r + " is: " + result);
    
   
   
  }
}