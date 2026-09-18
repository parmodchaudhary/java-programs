import java.util.Scanner;

public class SerialPattern {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("please! Enter raws and colums:");
         int m=sc.nextInt();
         int n=sc.nextInt();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(i+" ");
                
            }
            System.out.println();
            
        }
    }
}
