public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");

        int angka = 1000;
        System.out.println(angka);

        boolean benar = true;
        boolean salah = false;

        System.out.println(benar);
        System.out.println(salah);

        String firstName ="Fauzan Amirudin";
        String lastName ="Basith";

        System.out.println(firstName + " " + lastName);

        long[] arraylong = {
                1,2,3,4,5,6,7,8
        };
        String[] arrayString = {
                "Fauzan","Amirudin","Basith"
        };

        arrayString[1]= null;
        System.out.println(arrayString[1]);
        System.out.println(arraylong.length);

        String[][] anggota ={
                {"Ahmad", "Handoko"},
                {"Budi", "Santoso"},
                {"Gunawan"}
        };

        System.out.println(anggota[1][0]);
        System.out.println(anggota[0][0]);

        var nilaiUTS = 78;
        var nilaiUAS = 85;

        boolean utsLulus = nilaiUTS >= 76;
        boolean uasLulus = nilaiUAS >= 76;

        var hasil = utsLulus && uasLulus;
        System.out.println(hasil);

        var nilai = "E";
        switch (nilai){
            case "A" -> System.out.println("Wow Anda Hoki");
            case "B", "C" -> System.out.println("Anda Lulus");
            case "D" -> System.out.println("Anda Ga Lulus");
            default -> System.out.println("Anda Bego");
        }

        var nilai1 = 65 ;
        String ucapan = nilai1 >= 75 ? "Selamat anda lulus" : "Anda tidak lulus";
        System.out.println(ucapan);

        for (var itung = 1; itung <= 10; itung++ ){
            System.out.println("perulangan ke " + itung);
        }
    }
}
