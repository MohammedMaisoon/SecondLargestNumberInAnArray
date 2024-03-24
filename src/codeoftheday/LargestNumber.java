package codeoftheday;
public class LargestNumber {
    static int secondLargest(int[] input) {
        int firstLargest, secondLargest;
        if (input[0] > input[1]) {
            firstLargest = input[0];
            secondLargest = input[1];
        } else {
            firstLargest = input[1];
            secondLargest = input[0];
        }

        for (int i = 2; i < input.length; i++) {
            if (input[i] > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = input[i];
            } else if (input[i] < firstLargest && input[i] > secondLargest) {
                secondLargest = input[i];
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        System.out.println(secondLargest(new int[]{15, 61, 28, 85, 49, 42})); // Output: 61
        System.out.println(secondLargest(new int[]{785, 521, 975, 831, 479, 861})); // Output: 975
    }
}