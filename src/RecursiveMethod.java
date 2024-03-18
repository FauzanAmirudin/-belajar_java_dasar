public class RecursiveMethod {
    public static void main(String[] args) {

        System.out.println(factorial(5));
        System.out.println(factorialRecursive(7));
    }

    static int factorial(int value){
        var result = 1;
        for (var hasil = 1; hasil <= value; hasil++){
            result *= hasil;
        }
        return result;
    }

    // Dengan Recursive Method
    static int factorialRecursive(int value){
        if (value == 1 ){
            return 1;
        } else {
            return value * factorialRecursive(value -1);
        }
    }
}
