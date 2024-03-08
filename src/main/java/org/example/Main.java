package org.example;

public class Main {



        // Function to calculate the sum of digits of a number
        private static int sumOfDigits(int n) {
            int sum = 0;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            return sum;
        }

        // Function to find the maximum number of integers that have an identical sum of digits
        public static int maxIdenticalSum(int minNum, int maxNum) {
            // Array to store counts of integers with identical sums
            int[] sumCounts = new int[10];

            // Iterate through all integers between min and max (inclusive)
            for (int i = minNum; i <= maxNum; i++) {
                // Calculate the sum of digits for the current integer
                int digitSum = sumOfDigits(i);

                // Update the count of integers with identical sums
                sumCounts[digitSum]++;
            }

            // Find the maximum count of integers with identical sums
            int maxCount = 0;
            for (int count : sumCounts) {
                maxCount = Math.max(maxCount, count);
            }

            return maxCount;
        }

        public static void main(String[] args) {
            // Example usage
            int minNum = 5;
            int maxNum = 15;
            int result = maxIdenticalSum(minNum, maxNum);
            System.out.println("Output: " + result);


    }
}