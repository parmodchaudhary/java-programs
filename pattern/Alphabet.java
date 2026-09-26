import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {
                   Scanner sc = new Scanner(System.in);
                   System.out.println("Enter the number of rows and column");
                   int n = sc.nextInt();
             for(int i=0;i<=n;i++){
            for(int j=0; j<=n;j++){
System.out.print((char)(j+64)+ "  ");

            }
            System.out.println("");
            
            
        }
    }
}
