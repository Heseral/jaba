package d;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* fixme: не работающая версия
        Scanner scanner = new Scanner(System.in);
        int[][] input = new int[4][4];
        for (int r = 0; r < 4; r++) {
            for (int c = 0; c < 4; c++) {
                input[r][c] = scanner.nextInt();
            }
        }

        int firstVerticalLineIndex = -1;
        int secondVerticalLineIndex = -1;
        int firstHorizontalLineIndex = -1;
        int secondHorizontalLineIndex = -1;
        for (int r = 0; r < 4; r++) {
            if (input[r][0] == input[r][2] && input[r][1] != input[r][3]) {
                if (firstVerticalLineIndex == -1) {
                    firstVerticalLineIndex = r;
                    continue;
                }
                secondVerticalLineIndex = r;
                continue;
            }
            if (input[r][1] == input[r][3] && input[r][0] != input[r][2]) {
                if (firstHorizontalLineIndex == -1) {
                    firstHorizontalLineIndex = r;
                    continue;
                }
                secondHorizontalLineIndex = r;
                continue;
            }
            System.out.println("NO");
            return;
        }



        if (input[firstHorizontalLineIndex][0] != input[secondHorizontalLineIndex][0]) {
            System.out.println("NO");
            return;
        }
        if (input[firstHorizontalLineIndex][2] != input[secondHorizontalLineIndex][2]) {
            System.out.println("NO");
            return;
        }
        if (input[firstVerticalLineIndex][1] != input[secondVerticalLineIndex][1]) {
            System.out.println("NO");
            return;
        }
        if (input[firstVerticalLineIndex][3] != input[secondVerticalLineIndex][3]) {
            System.out.println("NO");
            return;
        }
        System.out.println("YES");

         */
    }
}
