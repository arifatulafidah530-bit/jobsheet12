import java.util.Scanner;
public class Percobaan2 {
    public static void cetakDeret(int x, int y) {
         if (y == 0) {
      System.out.print("1");
    } else {
      System.out.print(x + "x");
      cetakDeret(x, y - 1);
    }
  }
public static int hitungPangkat(int x, int y) {
    if (y == 0) {
      return 1;
    } else {
      return x * hitungPangkat(x, y - 1);
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int bilangan, pangkat;

    System.out.print("Bilangan yang dihitung: ");
    bilangan = sc.nextInt();

    System.out.print("Pangkat: ");
    pangkat = sc.nextInt();

    System.out.print("Deret: ");
    cetakDeret(bilangan, pangkat);
    System.out.println();

    System.out.println("Hasil: " + hitungPangkat(bilangan, pangkat));
    sc.close();
  }
}
