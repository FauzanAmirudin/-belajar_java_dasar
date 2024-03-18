public class ForEach {
    public static void main(String[] args) {

        String[] names = {
            "Fauzan" , "Amirudin" , "Basith" ,
            "Calon" , "Programmer"
        };

        for (var i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }

        System.out.println("Menggunakan For Each");
        for (var name : names){
            System.out.println(name);
        }
    }
}
