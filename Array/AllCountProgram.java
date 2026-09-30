public class AllCountProgram {
    public static int Zero(int[] arr,int count){
         
        for (int j = 0; j < arr.length; j++) {
            if (arr[j]<=0) {
    count++;
    
}
        }
        return count;

    }
    public static  int Negative(int[] arr,int count){
       
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<0) {
    count++;
    
}
        }
        return count;

    }
    public static  int Positive(int[] arr,int count){

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>0) {
    count++;
    
}
        }
        return count;

    }
    public static void main(String[] args) {
    int count=0;
  
    int[] arr={2,5,34,54,0,-8,3,-76,-3,-3,76,0,5,-7,0,0};
int r=Negative(arr,count);
int s=Positive(arr,count);
int t=Zero(arr,count);
System.out.println("the number of positive number is :"+s);
System.out.println("the number of negative number is :"+r);
System.out.println("the number of Zero number is :"+t);
}
    }




