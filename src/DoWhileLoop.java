public class DoWhileLoop {
    public static void main(String[] args) {
        // perulangan akan dilakukan setidaknya sekalii walaupun kondisinya bernilai false

        var nilai = 100;
        do {
            System.out.println("perulangan ke " + nilai);
            nilai++;
        } while (nilai <= 10);
    }
}
