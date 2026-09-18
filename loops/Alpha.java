import java.util.Scanner;

public class Alpha {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("please! Enter raws and colums:");
         int m=sc.nextInt();
         int n=sc.nextInt();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                char l=(64+1);
                char b=(65+1);
                char d=(66+1);

                System.out.print(l+" "+b+" "+d);
                
            }
            System.out.println();
            
        }
    }
}
