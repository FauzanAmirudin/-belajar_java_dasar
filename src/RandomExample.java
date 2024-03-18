import java.util.Random; // Mengimpor kelas Random

public class RandomExample {
    public static void main(String[] args) {
        Random random = new Random(); // Membuat instance dari kelas Random

        // Menghasilkan angka acak integer
        int randomInt = random.nextInt();
        System.out.println("Angka acak Integer: " + randomInt);

        // Menghasilkan angka acak double antara 0.0 dan 1.0
        double randomDouble = random.nextDouble();
        System.out.println("Angka acak Double: " + randomDouble);

        // Menghasilkan angka acak boolean
        boolean randomBoolean = random.nextBoolean();
        System.out.println("Angka acak Boolean: " + randomBoolean);

        // Menghasilkan angka acak integer dalam rentang 0 hingga 99
        int randomIntRange = random.nextInt(100);
        System.out.println("Angka acak Integer dalam rentang 0-99: " + randomIntRange);
    }
}

