import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        scanner.nextLine();
        String[] array = new String[amount];
        for (int i = 0; i < amount; i++) {
            array[amount - i - 1] = scanner.nextLine();
        }
        for (String piece : array) {
            System.out.println(piece);
        }
    }
}
