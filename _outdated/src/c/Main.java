package c;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        int[] array = new int[amount];
        for (int i = 0; i < amount; i++) {
            array[i] = scanner.nextInt();
        }
        // сумма слева
        int sumLeft = 0;
        // сумма справа
        int sumRight = 0;
        // кол-во способов
        int result = 0;
        // просто чтобы как можно сильнее уменьшить время выполнеия программы. В цикле это проверять было бы сложно
        int outerBorder = amount - 1;
        for (int i = 0; i < outerBorder; i++) {
            sumLeft += array[i];
            for (int j = i + 1; j < amount; j++) {
                sumRight += array[j];
            }
            if (sumLeft == sumRight) {
                result++;
            }
            sumRight = 0;
        }
        System.out.println(result);
    }
}

