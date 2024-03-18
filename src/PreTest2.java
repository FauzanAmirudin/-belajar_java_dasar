import java.util.Scanner;
public class PreTest2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sisiA = scanner.nextDouble();
        double sisiB = scanner.nextDouble();
        double sisiC = scanner.nextDouble();

        double s = (sisiA + sisiB + sisiC) / 2;
        double luas = Math.sqrt(s * (s - sisiA) * (s - sisiB) * (s - sisiC));

        System.out.println(luas);

        scanner.close();
    }

}
