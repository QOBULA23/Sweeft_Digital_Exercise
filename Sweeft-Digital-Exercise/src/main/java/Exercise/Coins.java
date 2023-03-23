package Exercise;

// We have 1,5,10,20 and 50 "Tetri" coins. Write a function that is given an amount ("Tetri")
// and returns the minimum number of coins with which we can close this amount.

public class Coins {
    static class coins
    {
        static int minCoins(int coins[], int x, int y)
        {
            int table[] = new int[y + 1];
            table[0] = 0;
            for (int i = 1; i <= y; i++)
                table[i] = Integer.MAX_VALUE;
            for (int i = 1; i <= y; i++)
            {
                for (int j = 0; j < x; j++)
                    if (coins[j] <= i)
                    {
                        int sub_res = table[i - coins[j]];
                        if (sub_res != Integer.MAX_VALUE
                                && sub_res + 1 < table[i])
                            table[i] = sub_res + 1;
                    }
            }

            if(table[y]==Integer.MAX_VALUE)
                return -1;
            return table[y];
        }
        public static void main (String[] args)
        {
            int coins[] = {1, 5, 10, 20,50};
            int x = coins.length;
            int y = 117;
            System.out.println ( "Minimum number of required coins is: " + minCoins(coins, x, y));
        }
    }
}
