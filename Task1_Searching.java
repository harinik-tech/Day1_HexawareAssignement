
import java.util.Arrays;

public class Task1_Searching {

    // Linear Search
    static void linearSearch(int a[], int key) {

        for (int i = 0; i < a.length; i++) {

            if (a[i] == key) {
                System.out.println("Linear Search: Order Found");
                System.out.println("Position: " + i);
                return;
            }
        }

        System.out.println("Linear Search: Order Not Found");
    }

    // Binary Search
    static void binarySearch(int a[], int key) {

        Arrays.sort(a);

        int low = 0;
        int high = a.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (a[mid] == key) {
                System.out.println("Binary Search: Order Found");
                System.out.println("Position: " + mid);
                return;
            }
            else if (a[mid] < key) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        System.out.println("Binary Search: Order Not Found");
    }

    public static void main(String args[]) {

        int orders[] = {105, 102, 108, 101, 104, 103};

        int key = 104;

        System.out.println("ORDER SEARCH");

        linearSearch(orders, key);
        binarySearch(orders, key);
    }
}
