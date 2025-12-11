public class Fibonacci {
    static int belumProduktif(int bulan) {
        if (bulan == 1 || bulan == 2) {
            return 1;
        }
        return total(bulan - 1);
    }
    static int produktif(int bulan) {
        if (bulan == 1 || bulan == 2) {
            return 0;
        }
        return belumProduktif(bulan - 1);
    }
    static int total(int bulan) {
        return produktif(bulan) + belumProduktif(bulan);
    }
    public static void main(String[] args) {
        System.out.printf("%-7s | %-10s | %-15s | %-10s\n","Bulan", "Produktif", "Belum Produktif", "Total");
        System.out.println("---------------------------------------------------------");
        for (int i = 1; i <= 12; i++) {
            System.out.printf("%-7d | %-10d | %-15d | %-10d\n",
                    i, produktif(i), belumProduktif(i), total(i));
        }
        System.out.println("\nTotal pasangan pada akhir bulan ke-12 = " + total(12));
    }
}
