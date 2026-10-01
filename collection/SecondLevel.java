import java.util.ArrayList;

public class SecondLevel {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        // [10, 20, 30, 40, 50]
        a.add(10);
        a.add(20);
        a.add(40);
        a.add(40);
        a.add(50);
        a.set(2,100 );
       a.remove(3);
    }
}
