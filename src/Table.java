import java.util.Random;
public class Table {
        // Metoda do wypełniania tablicy losowymi liczbami
        public static int[] fillArray(int size, int min, int max) {
            Random random = new Random();
            int[] array = new int[size];
            for (int i = 0; i < size; i++) {
                array[i] = random.nextInt(max - min + 1) + min;
            }
            return array;
        }

        // Metoda do wyszukiwania elementu w tablicy
        public static int searchElement(int[] array, int value) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == value) {
                    return i;
                }
            }
            return -1; // Element nie został znaleziony
        }
}

