import java.util.ArrayList;
import java.util.LinkedList;

public class Linklist {
    
    public static void main(String[] args) {
       LinkedList<Integer> arr = new LinkedList<>();
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(8);
        arr.add(23);
        arr.add(65);
        arr.add(1);
        arr.add(1,34);
       arr.remove(1);
        LinkedList<Integer> arr1=new LinkedList<>();
        arr1.add(56);
        arr1.add(76);
        arr1.add(23);
        arr1.add(98);
        arr1.add(670);
        arr1.add(340);
        // arr.addAll(arr1);
        // arr.removeAll(arr1);
        System.out.println(arr);
        System.out.println(arr.get(4));
       System.out.println("the size of the array list : "+ arr.size());
      System.out.println( arr.contains(34));
     System.out.println( arr.indexOf(34));
    for (int i = 0; i < arr.size(); i++) {
        System.out.println(arr.get(i));
     arr.sort(null);
      System.out.println(arr);

    }
    }

}
