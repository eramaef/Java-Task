public class TASK1118 {
    public static void main(String[] args) {
        int result = calculateCumulativeSum(4, 5, 10);
        System.out.println("Total sum: " + result);
    }

    // Integer variable arguments method
    public static int calculateCumulativeSum(int... numbers) {
        int totalSum = 0;
        int cumulativeSum = 0;

        for (int num : numbers) {
            cumulativeSum += num;
            totalSum += cumulativeSum;
            System.out.println("Cumulative sum for " + num + ": " + cumulativeSum);
        }

        return totalSum;
    }
}
