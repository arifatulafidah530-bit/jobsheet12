import java.util.Scanner;
public class Tugas06 {
    public static int jumlahRekursif(int[] data, int n) {
        if (n == 0) {
            return 0;
        } else {
            return data[n - 1] + jumlahRekursif(data, n - 1);
        }
    }
    public static int jumlahIteratif(int[] data, int n) {
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += data[i];
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
        int N = sc.nextInt();
        int[] data = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            data[i] = sc.nextInt();
            }
        int hasilRekursif = jumlahRekursif(data, N);
        int hasilIteratif = jumlahIteratif(data, N);

        System.out.println("Total dari " + N + " angka yang dimasukkan (rekursif): " + hasilRekursif);
        System.out.println("Total dari " + N + " angka yang dimasukkan (iteratif): " + hasilIteratif);

        sc.close();
    }
}
