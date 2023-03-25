import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] problems = new int[4];
        for (int i = 0; i < 4; i++) {
            problems[i] = sc.nextInt();
        }

        int weeks = 0;
        for (int i = 0; i < 4; i++) {
            if (problems[i] >= 10) {
                weeks++;
            }
        }

        System.out.println(weeks);

        sc.close();
    }
}
