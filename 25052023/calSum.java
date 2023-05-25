class calSum {
    public static int recalSum(int arr[], int index) {
        if (index == arr.length) {
            return 0;
        }
        {
            return arr[index] + recalSum(arr, index + 1);
        }
    }

    public static int itcalSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };

        // Recursive sum calculation

        long recursiveStartTime = System.nanoTime();
        int recursiveSum = recalSum(arr, 0);
        long recursiveEndTime = System.nanoTime();
        long recursiveExecutionTime = recursiveStartTime - recursiveEndTime;
        System.out.println("Recursive Sum= " + recursiveSum);
        System.out.println("Recursive Execution time(in nanoseconds) = " + recursiveExecutionTime);

        // Iterative sum calculation

        long iterativeStartTime = System.nanoTime();
        int iterativeSum = itcalSum(arr);
        long iterativeEndTime = System.nanoTime();
        long iterativeExecutionTime = iterativeStartTime - iterativeEndTime;
        System.out.println("Iterative Sum= " + iterativeSum);
        System.out.println("Iterative Execution time(in nanoseconds) = " + iterativeExecutionTime);

    }
}