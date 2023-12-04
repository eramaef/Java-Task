public class parameter{

    public static void main(String[] args) {
        int[] parameters = {4, 5, 10};
        computeCumulativeSums(parameters);
    }

    public static void computeCumulativeSums(int... parameters) {
        int totalSum = 0;
        for (int parameter : parameters) {
            int cumulativeSum = 0;
            for (int i = 1; i <= parameter; i++) {
                cumulativeSum += i;
            }
            totalSum += cumulativeSum;
            System.out.println("Cumulative sum for " + parameter + " is: " + cumulativeSum);
        }
        System.out.println("Total sum of all parameters is: " + totalSum);
    }
}
