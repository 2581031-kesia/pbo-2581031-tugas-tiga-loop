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

        // Bukti off-by-one
        // Bukti meleset satu (off-by-one) dengan dua penghitung terpisah.
        int kurang = 0;
        for (int i = 1; i < n; i++) {
            kurang++;
        }
        int kurangSama = 0;
        for (int i = 1; i <= n; i++) {
            kurangSama++;
        }
        System.out.println();
        System.out.println("i <  n berputar : " + kurang + " kali");
        System.out.println("i <= n berputar : " + kurangSama + " kali");

        // Saringan deret 1-10 (angka tetap, tidak ikut n)
        int sampaiPrintln = 0;
        System.out.print("Disaring :");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;  //lewati angka genap
            }
            if (i > 7) {
                break;   //berhenti kalau i > 7
            }
            System.out.print(" " + i);
            sampaiPrintln++;
        }
        System.out.println();
        System.out.println("Sampai println  : " + sampaiPrintln + " kali");

        // PENJELASAN SEMMUA KOMENTAR

        // 1. Kenapa loop penyaring tidak berhenti di i = 8 padahal 8 > 7?
        // Karena urutan pengecekan di dalam badan loop: pengecekan continue
        // (i % 2 == 0) ada SEBELUM pengecekan break (i > 7). Saat i = 8,
        // angka itu genap, sehingga continue langsung dieksekusi dan sisa
        // badan loop dilewati, termasuk if (i > 7) { break; } yang belum
        // sempat dicek. Loop lalu lanjut ke i = 9. Barulah di i = 9 (ganjil,
        // jadi lolos continue) kondisi i > 7 true dan break menghentikan loop.
        // Jadi loop sebenarnya berhenti di i = 9, bukan i = 8. Hasilnya tetap
        // 1 3 5 7 dengan println terpanggil 4 kali.

        // 2. Kenapa baris for dan while kosong saat n = 0?
        // for dan while adalah loop dengan pengecekan di AWAL (entry-controlled).
        // Kondisi dicek dulu sebelum badan loop dijalankan. Dengan n = 0,
        // kondisi 1 <= 0 langsung bernilai false, jadi badan loop tidak pernah
        // dijalankan dan tidak ada angka yang dicetak.

        // Kenapa baris do-while tetap mencetak 1?
        // do-while mengecek kondisi di AKHIR (exit-controlled). Badan loop
        // dijalankan lebih dulu (mencetak 1, lalu k menjadi 2), baru kemudian
        // kondisi k <= 0 dicek dan ternyata false sehingga loop berhenti.

        // Kesimpulan: do-while mengecek kondisinya sesudah badan loop dijalankan jadi badannya pasti jalan minimal sekali.

        scanner.close();
    }
}