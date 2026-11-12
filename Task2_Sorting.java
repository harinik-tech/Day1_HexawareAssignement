
import java.util.Arrays;

public class Task2_Sorting {

    // Selection Sort - O(n^2)
    static void selectionSort(int a[]) {

        for (int i = 0; i < a.length - 1; i++) {

            int max = i;

            for (int j = i + 1; j < a.length; j++) {

                if (a[j] > a[max]) {
                    max = j;
                }
            }

            int temp = a[i];
            a[i] = a[max];
            a[max] = temp;

            System.out.println("Pass " + (i + 1) +
                    ": " + Arrays.toString(a));
        }
    }

    // Merge Sort - O(n log n)
    static void mergeSort(int a[], int left, int right) {

        if (left < right) {

            int mid = (left + right) / 2;

            mergeSort(a, left, mid);
            mergeSort(a, mid + 1, right);

            merge(a, left, mid, right);
        }
    }

    static void merge(int a[], int left, int mid, int right) {

        int temp[] = new int[right - left + 1];

        int i = left;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right) {

            if (a[i] >= a[j]) {
                temp[k++] = a[i++];
            } else {
                temp[k++] = a[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = a[i++];
        }

        while (j <= right) {
            temp[k++] = a[j++];
        }

        for (int x = 0; x < temp.length; x++) {
            a[left + x] = temp[x];
        }
    }

    public static void main(String args[]) {

        int amounts[] = {250, 500, 150, 900, 350, 725, 125};

        int selection[] = amounts.clone();
        int merge[] = amounts.clone();

        System.out.println("SELECTION SORT");

        selectionSort(selection);

        System.out.println("\nFinal Selection Sort:");
        System.out.println(Arrays.toString(selection));

        System.out.println("\nMERGE SORT");

        mergeSort(merge, 0, merge.length - 1);

        System.out.println("Final Merge Sort:");
        System.out.println(Arrays.toString(merge));

        System.out.println("\nBUILT-IN SORT");

        Integer builtIn[] = {250, 500, 150, 900, 350, 725, 125};

        Arrays.sort(builtIn,
                (a, b) -> Integer.compare(b, a));

        System.out.println(Arrays.toString(builtIn));
    }
}
