import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class mai {
   
    
    public static void main(String[] args) {
       Stack<Integer> arr = new Stack<>();
    // Stack<Integer> stack = new Stack<>();
        arr.push(4);
        arr.push(5);
        arr.push(6);
        arr.push(8);
        arr.push(23);
        arr.push(65);
        arr.push(1);
        arr.push(1,34);
       arr.pop();
        Stack<Integer> arr1=new Stack<>();
        arr1.push(56);
        arr1.push(76);
        arr1.push(23);
        arr1.push(98);
        arr1.push(670);
        arr1.push(340);
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
