
import java.util.Arrays;

public class Task5_Refund {

    // GREEDY ALGORITHM
    static void greedy(int amount, int coins[]) {

        Arrays.sort(coins);

        System.out.print("Greedy Coins: ");

        for (int i = coins.length - 1; i >= 0; i--) {

            while (amount >= coins[i]) {

                System.out.print(coins[i] + " ");

                amount = amount - coins[i];
            }
        }

        System.out.println();
    }

    // DYNAMIC PROGRAMMING
    static void dynamicProgramming(int amount, int coins[]) {

        int dp[] = new int[amount + 1];

        int lastCoin[] = new int[amount + 1];

        Arrays.fill(dp, amount + 1);

        dp[0] = 0;

        for (int i = 1; i <= amount; i++) {

            for (int coin : coins) {

                if (coin <= i &&
                    dp[i - coin] + 1 < dp[i]) {

                    dp[i] = dp[i - coin] + 1;

                    lastCoin[i] = coin;
                }
            }
        }

        if (dp[amount] == amount + 1) {
            System.out.println("Change not possible");
            return;
        }

        System.out.println(
            "Minimum Coins Required: " + dp[amount]);

        System.out.print("DP Coins: ");

        while (amount > 0) {

            System.out.print(lastCoin[amount] + " ");

            amount = amount - lastCoin[amount];
        }

        System.out.println();
    }

    public static void main(String args[]) {

        int amount = 6;

        int coins[] = {1, 3, 4};

        System.out.println("REFUND CALCULATION");

        System.out.println("Amount: " + amount);

        System.out.println("Denominations: " +
                Arrays.toString(coins));

        greedy(amount, coins);

        dynamicProgramming(amount, coins);
    }
}
