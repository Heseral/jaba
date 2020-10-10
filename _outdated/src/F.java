import java.util.Scanner;

public class F {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int width = scanner.nextInt();
        int y1 = scanner.nextInt() - 1;
        int x1 = scanner.nextInt() - 1;
        int y2 = scanner.nextInt() - 1;
        int x2 = scanner.nextInt() - 1;
        if (y1 > y2) {
            int temp = y1;
            y1 = y2;
            y2 = temp;
        }
        if (x1 > x2) {
            int temp = x1;
            x1 = x2;
            x2 = temp;
        }
        boolean isWidthNechetnaya = (width & 1) == 1;
        boolean isLeftSideNechetnaya = (x1 & 1) == 1;
        boolean isRightSideNechetnaya = ((width - x2 + 1) & 1) == 1;

        int halfedPlitkaAmount = 0;
        int odinocnayaPlitkaAmount = 0;

        for (int row = 0; row < height; row++) {
            if (row < y1 || row > y2) {
                if (isWidthNechetnaya) {
                    if (odinocnayaPlitkaAmount > 0) {
                        odinocnayaPlitkaAmount--;
                        continue;
                    }
                    halfedPlitkaAmount++;
                    odinocnayaPlitkaAmount++;
                }
                continue;
            }
            if (isLeftSideNechetnaya) {
                if (odinocnayaPlitkaAmount > 0) {
                    odinocnayaPlitkaAmount--;
                } else {
                    halfedPlitkaAmount++;
                    odinocnayaPlitkaAmount++;
                }
            }
            if (isRightSideNechetnaya) {
                if (odinocnayaPlitkaAmount > 0) {
                    odinocnayaPlitkaAmount--;
                } else {
                    halfedPlitkaAmount++;
                    odinocnayaPlitkaAmount++;
                }
            }
        }
        System.out.println(halfedPlitkaAmount);
    }
}
