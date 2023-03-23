package Exercise;

// Given two binary strings a and b, return their sum as a binary string.

public class BinaryString {

    public static class binarystring {

        static String add_Binary(String a, String b)
        {

            int num1 = Integer.parseInt(a,2);

            int num2 = Integer.parseInt(b,2);


            int sum = num1 + num2;

            String result = Integer.toBinaryString(sum);

            return result;
        }

        public static void main(String args[])
        {
            String a = "011011", b = "1010111";

            System.out.print(add_Binary(a, b));
        }
    }

}
