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
            System.out.println(" " + i);
        }
        System.out.println();

        // 2. Versi while (variabel pencacah: j)
        System.out.print("while    :");
        int j = 1;
        while (j <= n) {
            System.out.println(" " + j);
            j++; // jangan lupa dinaikkan, kalau tidak program akan menggantung
        }
        System.out.println();

        // 3. Versi do-while (variabel pencacah: k)
        System.out.print("do-while :");
        int k = 1;
        do {
            System.out.println(" " + k);
            k++;
        }  while (k <= n);
        System.out.println();

        // Bukti off-by-one
        // Bukti meleset satu (off-by-one) dengan dua penghitung terpisah.
        int kurang = 0;
        for (int i = 1; i <= n; i++) {
            kurang++;
        }
        int kurangSama = 0;
        for (int i = 1; i <= n; i++) {
            kurangSama++;
        }
        System.out.println();
        System.out.println("i <  n berputar : " + kurang + " kali");
        System.out.println("i <= n berputar : " + kurangSama + " kali");
    }
}