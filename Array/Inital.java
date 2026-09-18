import java.util.Scanner;

public class Inital {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of the element:");
    int range =sc.nextInt();
    int[] arr=new int[range];
    for(int i=0;i<range;i++){
        arr[i]=sc.nextInt();
    }
    for(int i=0;i<range;i++){
       System.out.println(arr[i]);
    }

    }
}
