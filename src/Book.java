import java.util.*;
public class Book {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = input.nextInt();

        System.out.print("Deret bilangan genap hingga " + n + ": ");

        int i = 2; // Mulai dari bilangan 2
        while (i <= n) {
            System.out.print(i + " ");
            i += 2; // Melangkah 2 angka setiap iterasi untuk mendapatkan bilangan genap berikutnya
        }

        input.close();
    }


}