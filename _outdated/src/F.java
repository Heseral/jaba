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

        int halfedPlitkaAmount = 0;
        int odinocnayaPlitkaAmount = 0;

        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                if (row >= y1 && row <= y2 && col >= x1 && col <= x2) {
                    continue;
                }
                if (col == width - 1 || (row >= y1 && row <= y2 && col + 1 >= x1 && col + 1 <= x2)) {
                    if (odinocnayaPlitkaAmount > 0) {
                        odinocnayaPlitkaAmount--;
                    } else {
                        odinocnayaPlitkaAmount++;
                        halfedPlitkaAmount++;
                    }
                }
                col++;
            }
        }
        System.out.println(halfedPlitkaAmount);
    }
}
