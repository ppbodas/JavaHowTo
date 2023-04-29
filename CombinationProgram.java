import java.util.ArrayList;
import java.util.Arrays;

public class CombinationProgram {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        CombinationProgram program = new CombinationProgram();
        program.runProgram();
    }

    private void runProgram() {
        // Create and initialize int array
        int[] array = {1, 2, 3, 4, 5};

        int n = 2;
        ArrayList<int[]> combinations = new ArrayList<>();
        // Create all possible combinations
        // of size n in array
        // and store them in combinations
        int [] data = new int[n];

        createCombinations(array, n, 0 , 0, data, combinations);
        // Print combinations count
        System.out.println("Number of combinations " + combinations.size());

        // Print all combinations
        combinations.forEach(ints -> {
            Arrays.stream(ints).forEach(System.out::print);
            System.out.println();
        });
    }

    private void createCombinations(
            final int[] array, final int n,
            final int index, final int pos,  final int[] data, final ArrayList<int[]> combinations) {
        if (pos == n) {
            // Store the combination in combinations
            combinations.add(data.clone());
            return;
        }
        if (index < array.length) {
            data[pos] = array[index];
            createCombinations(array, n, index + 1, pos + 1, data, combinations);
            createCombinations(array, n, index + 1, pos, data, combinations);
        }
    }
}