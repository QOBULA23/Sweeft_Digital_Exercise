package Exercise;

// We have a staircase with N floors, we can climb 1 or 2 steps in one action. Write a function that counts the number of options to go up to n floors.

public  class Nstairs {
    static class stairs {

        static int STR(int n) {
            if (n <= 1)
                return n;
            return STR(n - 1) + STR(n - 2);
        }

        static int countWays(int s) {
            return STR(s + 1);
        }

        public static void main(String args[]) {
            int s = 4;
            System.out.println("Number of ways = " + countWays(s));
        }
    }
}
