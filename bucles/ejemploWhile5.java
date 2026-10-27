package bucles;

public class ejemploWhile5 {

    public static void main(String[] args) {

        String palabra ="";

        while (!palabra.equals("peligro")){

            palabra = IO.readln("Dime una palabra :").toLowerCase();
        }
        
    }
    
}
