import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        int[] temperature = new int[amount];
        for (int i = 0; i < amount; i++) {
            temperature[i] = scanner.nextInt();
        }

        int delta = temperature[1] - temperature[0];
        for (int i = 2; i < amount; i++) {
            if (temperature[i] - delta != temperature[i - 1]) {
                System.out.println(temperature[amount - 1]);
                return;
            }
        }
        System.out.println(temperature[amount - 1] + delta);
    }
}
