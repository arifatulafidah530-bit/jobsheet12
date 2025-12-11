public class DeretDescendingRekursif {
    static void descendingRekursif(int n) {
        if (n < 0) {
            return; 
        }
        System.out.print(n + " ");
        descendingRekursif(n - 1); 
    }
    static void descendingIteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        System.out.println("Rekursif:");
        descendingRekursif(10);

        System.out.println("\nIteratif:");
        descendingIteratif(10);
    }
}
