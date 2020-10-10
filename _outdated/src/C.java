import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        int[] array = new int[amount];

        for (int i = 0; i < amount; i++) {
            array[i] = scanner.nextInt();
        }
        int sumLeft = array[0];
        int sumRight = 0;
        for (int i = 1; i < amount; i++) {
            sumRight += array[i];
        }
        int result = 0;
        for (int i = 1; i < amount; i++) {
            if (sumLeft == sumRight) {
                result++;
            }
            sumLeft += array[i];
            sumRight -= array[i];
        }
        System.out.print(result);
    }
}

