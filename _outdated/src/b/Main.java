package b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        scanner.nextLine();
        String[] array = new String[amount];
        for (int i = 0; i < amount; i++) {
            array[i] = scanner.nextLine();
        }
        String temp;
        for (int i = 0; i < amount; i++) {
            if (i < amount / 2) {
                temp = array[i];
                array[i] = array[amount - i - 1];
                array[amount - i - 1] = temp;
            }
            System.out.println(array[i]);
        }
    }
}
