public class SumOFArray {
    public static void main(String[] args) {
        int[] arr={33,5,6,4,64,64};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
        }
        System.out.println("the sum of all the array :"+sum);
    }
}
