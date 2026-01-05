import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, i, l, h, mid, s, index;
        int[] a = new int[50];

        System.out.println("Enter n");
        n = sc.nextInt();

        System.out.println("Enter the values one by one (sorted order)");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the search element");
        s = sc.nextInt();

        l = 0;
        h = n - 1;
        index = -1;

        while (l <= h) {
            mid = (l + h) / 2;

            if (a[mid] == s) {
                index = mid;
                break;
            } else if (a[mid] < s) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }

        if (index == -1) {
            System.out.println("Element is not found");
        } else {
            System.out.println("Element is found at index " + index);
        }
    }
}
