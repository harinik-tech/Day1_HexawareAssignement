
import java.util.HashSet;

public class Task3_Duplicates {

    public static void main(String args[]) {

        int customerId[] = {101, 102, 101, 103, 102, 104};

        int amount[] = {500, 300, 500, 700, 300, 200};

        int minute[] = {10, 11, 10, 12, 11, 15};

        int orderId[] = {1001, 1002, 1003, 1004, 1005, 1006};

        HashSet<String> set = new HashSet<>();

        boolean found = false;

        System.out.println("DUPLICATE ORDER DETECTION");

        for (int i = 0; i < customerId.length; i++) {

            String key = customerId[i] + "-" +
                         amount[i] + "-" + minute[i];

            if (set.contains(key)) {

                System.out.println(
                    "Duplicate Order Found: " + orderId[i]);

                found = true;
            }
            else {

                set.add(key);
            }
        }

        if (!found) {
            System.out.println("No Duplicates Found");
        }
    }
}
