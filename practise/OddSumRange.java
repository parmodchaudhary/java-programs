import java.util.Scanner;

public class OddSumRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("enter the range to print odd number:");
int range = sc.nextInt();
int i=1;
 int sum=0;
while (i<=range) {
    if (i%2!=0) {
        sum=sum+i;
    }
    i++;
    
}
System.out.println("the sum of odd number between 1 to "+range+ " is" +sum);
    }
}
