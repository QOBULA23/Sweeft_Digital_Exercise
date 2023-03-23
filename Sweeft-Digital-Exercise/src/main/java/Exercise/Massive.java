package Exercise;

// Given an array consisting of integers. Write a function that is passed this array and returns the smallest integer greater than 0 that is not in this array.

public class Massive {
    public static class massive {

        static int solution(int[] A)
        {
            int n = A.length;
            int N = 1000010;

            boolean[] present = new boolean[N];

            int maxele = Integer.MIN_VALUE;

            for (int i = 0; i < n; i++) {


                if (A[i] > 0 && A[i] <= n)
                    present[A[i]] = true;


                maxele = Math.max(maxele, A[i]);
            }


            for (int i = 1; i < N; i++)
                if (!present[i])
                    return i;


            return maxele + 1;
        }

        public static void main(String[] args)
        {
            int arr[] = { 1, 10, 2, 30, 40 };
            System.out.println(solution(arr));
        }
    }

}
