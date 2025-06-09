public class ArrayStats {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30};
        int[] arr2 = {5, 15, 25};

        // Merge arrays
        int[] merged = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, merged, 0, arr1.length);
        System.arraycopy(arr2, 0, merged, arr1.length, arr2.length);

        int max = merged[0];
        int min = merged[0];
        int sum = 0;

        for (int num : merged) {
            if (num > max) max = num;
            if (num < min) min = num;
            sum += num;
        }

        double average = (double) sum / merged.length;

        System.out.print("Merged array: ");
        for (int num : merged) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Max value: " + max);
        System.out.println("Min value: " + min);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
