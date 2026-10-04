import java.util.Scanner;
public class TigaLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Batas deret (n) : ");
        int n = scanner.nextInt();

        System.out.println();
        System.out.println("===== SATU DERET, TIGA LOOP =====");

        // 1. Versi for (variabel pencacah: i)
        System.out.print("for      :");
        for (int i = 1; i <= n; i++) {
            System.out.print(" " + i);
        }
        System.out.println();

        // 2. Versi while (variabel pencacah: j)
        System.out.print("while    :");
        int j = 1;
        while (j <= n) {
            System.out.print(" " + j);
            j++; // jangan lupa dinaikkan, kalau tidak program akan menggantung
        }
        System.out.println();

        // 3. Versi do-while (variabel pencacah: k)
        System.out.print("do-while :");
        int k = 1;
        do {
            System.out.print(" " + k);
            k++;
        }  while (k <= n);
        System.out.println();

