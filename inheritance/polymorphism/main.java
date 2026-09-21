package polymorphism;

public class main {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        System.out.println(c1.sum(2, 4));
        System.out.println(c1.sum(2,4,6));
        System.out.println(c1.sum(3,7,9.6));
    }
    
}
