import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main myMainProgram = new Main();
        myMainProgram.runPrograms();

    }

    public void runPrograms() {
        // Read file from console
        // readDataFromConsoleLineByLine();

        // Define Array
        int [] intArr = {1, 3, 5};
        Arrays.stream(intArr).forEach(System.out::println);

        int [] intArr1 = new int[5];
        intArr1[3] = 8;
        Arrays.stream(intArr1).forEach(System.out::println);

        // Define ArrayList
        ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 3));
        intList.forEach(System.out::print);

        System.out.println();

        // Initialize map
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Prathmesh", 100);
        hashMap.put("Anay", 100);
        hashMap.forEach((k,v) ->{
            System.out.println("Key is: " + k + " Value is: " + v.toString());
        });

        // iterating over arraylist
        ArrayList<Integer> intList1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        for (Integer i : intList1) {
            System.out.println(i);
        }

        // Print Java Integer limiting values
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);


    }

    private void readDataFromConsoleLineByLine() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter text (Press Enter key twice to stop):");
        StringBuilder sb = new StringBuilder();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.isEmpty()) {
                break;
            }

            sb.append(line).append(System.lineSeparator());
        }
        scanner.close();

        System.out.println("Input from console:\n" + sb.toString());
    }
}
