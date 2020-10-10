import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class H {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amount = scanner.nextInt();
        int height = scanner.nextInt();
        int maxX = 0;
        List<Boolean> hasVozdusniyPotok = new ArrayList<>();
        int x1 = 0;
        int x2 = 0;
        int balance = 0;
        for (int i = 0; i < amount; i++) {
            if (x2 > maxX) {
                maxX = x2;
            }
            x1 = scanner.nextInt();
            for (int j = x2; j < x1; j++) {
                hasVozdusniyPotok.add(false);
            }
            x2 = scanner.nextInt();

            for (int j = x1; j < x2; j++) {
                hasVozdusniyPotok.add(true);
                balance++;
            }
        }
        balance -= maxX - balance;

        int maxBalanceAtStartPoint = 0;
        int maxBalance = balance;
        for (int startPoint = 0; startPoint < maxX; startPoint++) {
            if (hasVozdusniyPotok.get(startPoint)) {
                balance--;
            } else {
                balance++;
            }
            if (balance > maxBalance) {
                maxBalance = balance;
                maxBalanceAtStartPoint = startPoint;
            }
        }

        System.out.println((maxX - balance) / 2);
    }
}
