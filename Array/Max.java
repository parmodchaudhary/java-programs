public class Max {
    
    public static void main(String[] args) {
        int[] arr={43,6,3,6,334,664,643,900};
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min) {
                min=arr[i];
                
            }
        }
        System.out.println("The min values in the array is : "+min);
    }

}
