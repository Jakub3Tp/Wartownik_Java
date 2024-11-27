import java.util.Random;
public class Table {
    private static int[] n;

    public Table(int size, int min, int max) {
        this.n = new int[size];
        FillIt(min, max);
    }

    private void FillIt(int min, int max) {
        Random random = new Random();
        for (int i = 0; i < n.length; i++) {
            n[i] = random.nextInt(max - min + 1) + min;
        }
    }

    public static int Search(int value) {
        for (int i = 0; i < n.length; i++) {
            if (n[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static int[] getN() {
        return n;
    }
}

