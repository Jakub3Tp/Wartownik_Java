import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Program do wyszukiwania pierwszego wystąpienia liczby w tablicy.\n");

        // Wypełnianie tablicy
        int[] array = Table.fillArray(50, 1, 100);
        System.out.println("Tablica została wypełniona losowymi liczbami.\n");

        // Pobieranie wartości od użytkownika
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę całkowitą do wyszukania w tablicy: ");
        int valueToFind;

        try {
            valueToFind = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Wprowadzono nieprawidłową wartość. Uruchom program ponownie.");
            scanner.close();
            return;
        }

        // Wyszukiwanie elementu
        int index = Table.searchElement(array, valueToFind);

        // Wyświetlenie wyników
        System.out.println("\nZawartość tablicy:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + (i < array.length - 1 ? ", " : ""));
        }

        if (index != -1) {
            System.out.println("\n\nLiczba " + valueToFind + " została znaleziona na indeksie: " + index);
        } else {
            System.out.println("\n\nLiczba " + valueToFind + " nie została znaleziona w tablicy.");
        }

        scanner.close();
    }
}