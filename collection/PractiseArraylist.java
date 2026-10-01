import java.util.ArrayList;

public class PractiseArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        // add 10, 20, 30, 40.
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        for (int index = 0; index < a.size(); index++) {
            System.out.println(a.get(index));
        }
System.out.println("The size of array list is : "+a.size());
System.out.println(a.contains(30));
System.out.println( "the index of 40 is "+a.indexOf(40));
a.set(1,25);
System.out.println(a.isEmpty());
a.clear();
    }
}
