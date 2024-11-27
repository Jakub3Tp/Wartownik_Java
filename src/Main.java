import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Table table = new Table(50, 1, 100);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę (całkowitą) do wyszukania w tablicy: ");
        int find;
        try {
            find = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Wprowadzono nieprawidłową wartość. Uruchom program ponownie.");
            scanner.close();
            return;
        }

        int index = Table.search(find);

        int[] n = Table.getN();
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + (i < n.length - 1 ? ", " : ""));
        }

        if (index != -1) {
            System.out.println("\nLiczba " + find + " została znaleziona na indeksie: " + index);
        } else {
            System.out.println("\nLiczba " + find + " nie została znaleziona w tablicy.");
        }

        scanner.close();
    }
}
