import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s=0,p,x;
        System.out.println("enter the number to check Armstrong ");
         x = sc.nextInt();
         int y=x;
 
        while (x!=0) {
            p=x%10;
        s=s+(p*p*p);
        x=x/10;
        }
        if (s==y) {
            System.out.println("this number is Armstrong number. ");
        } else {
               System.out.println("this number is not Armstrong number.");
        }
    }
}
