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
        // Print Java Integer limiting values
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);

        // Read file from console
        // readDataFromConsoleLineByLine();

        arrayHowTos();

        arrayListHowTos();

        hashMapHowTos();

    }

    private static void hashMapHowTos() {
        System.out.println("------------ hashMap How Tos ----------------");
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Prathmesh", 100);
        hashMap.put("Anay", 100);
        hashMap.forEach((k,v) ->{
            System.out.println("Key is: " + k + " Value is: " + v.toString());
        });

        System.out.println("");
    }

    private static void arrayListHowTos() {
        System.out.println("------------ arrayList How Tos ----------------");
        // Define ArrayList
        ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 3));
        intList.forEach(System.out::print);

        System.out.println();

        // iterating over arraylist
        ArrayList<Integer> intList1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        for (Integer i : intList1) {
            System.out.print(i);
        }

        // Change second element
        intList1.set(1, 5);
        intList1.forEach(System.out::print);

        System.out.println("");
    }

    private static void arrayHowTos() {
        System.out.println("------------ array How Tos ----------------");
        // Define Array
        int [] intArr = {1, 3, 5};
        Arrays.stream(intArr).forEach(System.out::println);

        for (int i = 0; i < intArr.length; ++i) {
            System.out.print(intArr[i]);
        }
        System.out.println("");

        int [] intArr1 = new int[5];
        intArr1[3] = 8;
        Arrays.stream(intArr1).forEach(System.out::println);
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
