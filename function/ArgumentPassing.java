import java.util.Scanner;
public class ArgumentPassing {
    public static void name(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String n = scanner.nextLine();
        int j = scanner.nextInt();
        name(n,j);
    }
}
