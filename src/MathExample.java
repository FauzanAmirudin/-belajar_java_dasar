public class MathExample {
    public static void main(String[] args) {
        // Menggunakan konstan PI dan E
        System.out.println("Nilai PI: " + Math.PI);
        System.out.println("Nilai E: " + Math.E);

        // Menggunakan fungsi eksponensial dan logaritma
        System.out.println("e^2: " + Math.exp(2));
        System.out.println("log(e^2): " + Math.log(Math.exp(2)));
        System.out.println("log10(100): " + Math.log10(100));

        // Menggunakan fungsi akar dan pangkat
        System.out.println("Akar kuadrat dari 25: " + Math.sqrt(25));
        System.out.println("2 pangkat 3: " + Math.pow(2, 3));

        // Menggunakan fungsi trigonometri
        System.out.println("Sinus 90 derajat: " + Math.sin(Math.toRadians(90)));
        System.out.println("Kosinus 0 derajat: " + Math.cos(Math.toRadians(0)));

        // Menggunakan fungsi pembulatan
        System.out.println("Pembulatan ke atas dari 3.14: " + Math.ceil(3.14));
        System.out.println("Pembulatan ke bawah dari 3.99: " + Math.floor(3.99));
        System.out.println("Pembulatan terdekat dari 3.5: " + Math.round(3.5));
    }
}

