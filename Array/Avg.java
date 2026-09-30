public class Avg {
    public static void main(String[] args) {
        int[] arr={43,6,3,6,334,664,643,900};
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) {
                max=arr[i];
                
            }
        }
        System.out.println("The max values in the array is : "+max);
    }
}
