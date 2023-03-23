package Exercise;
import java.util.Arrays;

// We have a list of integers where every number except one repeats, find the number that does not repeat
public class CountSinglenumber {

     static class Singlenumber
    {
        public static void countFreq(int arr[], int n)
        {
            boolean visited[] = new boolean[n];
            Arrays.fill(visited, false);
            for (int i = 0; i < n; i++) {

                if (visited[i] == true)
                    continue;

                int count = 1;
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        visited[j] = true;
                        count++;
                    }
                }
                if(count==1)
                    System.out.println(arr[i]);
            }
        }

        public static void main(String []args)
        {
            int arr[] = new int[]{7, 11, 17, 8, 7, 8, 5, 7};
            int n = arr.length;
            countFreq(arr, n);
        }
    }
}