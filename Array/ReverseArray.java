
 public class ReverseArray {
    public static void main(String[] args) {

        int[] a = {10, 20, 30, 40, 50};

        int n = a.length;

        for (int i = 0; i < n / 2; i++) {

            int t = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = t;
        }

        // Print reversed array
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}