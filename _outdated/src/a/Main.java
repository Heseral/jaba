package a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rawInput = scanner.nextLine();
        String[] input = rawInput.split(" ");
        int price = Integer.parseInt(input[0]);
        int length = Integer.parseInt(input[1]);

        if (price < 1 || price > 100 || length < 1 || length > 100) {
            System.out.println("Ошибка входных данных.");
            return;
        }

        System.out.println(price * length);
    }
}
