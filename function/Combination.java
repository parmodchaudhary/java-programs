import java.util.Scanner;
public class Combination {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your n");
        int n = scanner.nextInt();
        System.out.println("enter your r");
        int r = scanner.nextInt();
         int nfact=1;
                for(int i = 1; i <= n; i++) {
                    nfact *= i;
                }
                for(int i = 1; i <= r; i++) {
                    nfact *= i;
                }
    for(int i = 1; i <= (n-r); i++) {
                    nfact *= i;
                }
                int result = nfact/(nfact*nfact);
                System.out.println("The combination of " + n + " and " + r + " is: " + result);
 }

}
