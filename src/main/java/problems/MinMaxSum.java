package problems;

import java.util.Scanner;
import java.util.stream.IntStream;

public class MinMaxSum {
    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        long Total = IntStream.of(arr).asLongStream().sum();
        long minValue = IntStream.of(arr).asLongStream().min().getAsLong();
        long maxValue = IntStream.of(arr).asLongStream().max().getAsLong();
        //int minSum = Total - maxValue;
        //int maxSum = Total - minValue;
       // System.out.println((Total-maxValue)+"\t"+(Total-minValue));
        long minSum = IntStream.of(arr).asLongStream().sorted().limit(arr.length-1).sum();
         long maxSum = IntStream.of(arr).asLongStream().sorted().skip(1).sum();
        System.out.print(minSum+"\t"+maxSum);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];
        System.out.println("Enter numbers");
        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
