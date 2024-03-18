public class Fucntion {
    public static void main(String[] args) {
        helloWorld();
        sayHello("Fauzan" , "Basith");

        System.out.println(hitung(100, 200));
        System.out.println(jumlah(200 , "/" , 100));
    }

    static void helloWorld(){
        System.out.println("Hello World 1");
        System.out.println("Hello World 2");
        System.out.println("Hello World 3");
    }

    static void sayHello(String firstName, String lastName){
        System.out.println("Nama saya " + firstName + " " + lastName);
    }

    static int hitung(int nilai1 , int nilai2){
        int hasil = nilai1 + nilai2;
        return hasil;
    }

    static int jumlah(int nilai3 , String tanda, int nilai4){
        switch (tanda){
            case "+" :
                return nilai3 + nilai4;
            case "-" :
                return nilai3 - nilai4;
            case "*" :
                return nilai3 * nilai4;
            default:
                return 0;
        }
    }
}
