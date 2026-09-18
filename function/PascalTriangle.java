import java.util.Scanner;
public class PascalTriangle {
    public static int xfact(int n){
        int fct=1;
        for(int i=1;i<=n;i++){
            fct*=i;
        }
        return fct;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       
        for(int i=0;i<n;i++){
            for(int j=0;j<=n-i;j++){
                System.out.print(" ");
        }
            for(int j=0;j<=i;j++){
                System.out.print(xfact(i)/(xfact(j)*xfact(i-j))+"  ");
            }
            System.out.println();
        }
    }
}