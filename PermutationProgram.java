import java.util.ArrayList;
import java.util.Arrays;

public class PermutationProgram {
    public static void main(String[] args) {

        PermutationProgram program = new PermutationProgram();
        program.runProgram();
    }

    private void runProgram() {
        // Create array of integers from list of integers
        int [] arr = {1, 2, 3, 4,5};

        ArrayList<int[]> permutations = new ArrayList<>();

        printArray(arr);
        System.out.println();

        // permute(arr, 0, permutations);

        int n = 3;

        permuteN(arr, 0, n,  permutations);

        // Print permutations list count
        System.out.println(permutations.size());

        permutations.forEach(PermutationProgram::printArray);
    }

    private void permuteN(final int[] arr, final int pos, final int n, final ArrayList<int[]> permutations) {
        if (pos == n) {
            // Add first n elements of array to list
            int [] temp = new int[n];
            for (int i = 0; i < n; i++) {
                temp[i] = arr[i];
            }
            permutations.add(temp);
        } else {
            for (int j = pos; j <= arr.length-1; j++) {
                swap(arr, pos, j);
                permuteN(arr, pos + 1,  n, permutations);
                swap(arr, pos, j);
            }
        }
    }

    private static void printArray(final int[] arr) {
        // Print array
        Arrays.stream(arr).forEach(System.out::print);

        System.out.println();
    }

    private void permute(final int[] arr, final int pos, final ArrayList<int[]> permutations) {
        if (pos == arr.length-1) {
            permutations.add(arr);
        } else {
            for (int j = pos; j <= arr.length-1; j++) {
                swap(arr, pos, j);
                permute(arr, pos + 1,  permutations);
                swap(arr, pos, j);
            }
        }
    }


    private void swap(final int[] arr, final int i, final int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}