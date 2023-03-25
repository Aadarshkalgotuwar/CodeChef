import java.util.Scanner;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int j = 0; j < t; j++) { // Use a different variable name for the loop counter to avoid conflicts.
            int n = sc.nextInt();
            int arr[] = new int[n]; // Correct the typo "Int" to "int" to declare an array of integers.
            int count = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt(); // Read in each difficulty rating and store it in the array.
                if (arr[i] >= 1000) {
                    count++;
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}
