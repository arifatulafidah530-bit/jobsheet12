public class PenjumlahanRekursif {
    static int jumlah(int n) {
        if (n == 1) {
            return 1; 
        }
        return n + jumlah(n - 1);
    }
    public static void main(String[] args) {
        int f = 8;
        System.out.println("Penjumlahan 1 sampai " + f + " = " + jumlah(f));
    }
}