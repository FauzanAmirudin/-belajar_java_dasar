public class MethodVariabelArgument {
    public static void main(String[] args) {

        int[] values = {75,82,89,83};
        sayCongrats("Fauzan", values);

        sayCongrat("Jason", 85,98,35,68,100,97);
    }
    static void sayCongrats (String name, int[] values) {
        int total = 0;
        for (var value : values){
            total += value;
        }
        int finalValue = total / values.length;

        if (finalValue >= 75){
            System.out.println("Selamat " + name + ", Anda Lulus");
        } else {
            System.out.println("Maaf " + name + ", Anda Tidak Lulus");
        }
    }

    // Dengan Variable Argument
    static void sayCongrat(String name, int... values) {
        int total = 0;
        for (var value : values){
            total += value;
        }
        int finalValue = total / values.length;

        if (finalValue >= 75){
            System.out.println("Selamat " + name + ", Anda Lulus");
        } else {
            System.out.println("Maaf " + name + ", Anda Tidak Lulus");
        }
    }
}
