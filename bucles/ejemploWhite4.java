package bucles;

public class ejemploWhite4 {
    public static void main(String[] args) {

        int dado = 0;
        int numtirada = 20;

        while (numtirada > 0) {

            dado = (int) (Math.random()* (10 - 1 + 1)) + 1; 
            IO.println("Tirada: " + dado);   
            numtirada -=1;   
                  
        }
       

        
    }
    
}
