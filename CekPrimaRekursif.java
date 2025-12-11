public class CekPrimaRekursif {
    static boolean cekPrima(int n, int pembagi) {
        if (n < 2) {
            return false;
        }
        if (pembagi == n) {
            return true;
        }
        if (n % pembagi == 0) {
            return false;
        }
        return cekPrima(n, pembagi + 1);
    }
    public static void main(String[] args) {
        int n = 17;
        if (cekPrima(n, 2)) {
            System.out.println(n + " adalah bilangan prima");
        } else {
            System.out.println(n + " bukan bilangan prima");
        }
    }
}