public class EvenCount {
    public static void main(String[] args) {
        int[] arr={4,6,3,6,4,3,34,6,7,8,9,7,656,34,32,65,76,7,56,45};
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0) {
                count++;
                
            }
        }
        System.out.println("the total count of even number is : "+count);
    }
}
