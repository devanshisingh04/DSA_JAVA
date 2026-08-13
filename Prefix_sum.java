import java.util.Arrays;
import java.util.Scanner;

public class Prefix_sum {

    static void presum(int[] arr, int i) {
        if (i >= arr.length) {
            return;
        }

        arr[i] += arr[i - 1];
        presum(arr, i + 1);
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        presum(arr, 1);

        System.out.println("Prefix array: " + Arrays.toString(arr));
    }
}
