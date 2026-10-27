package tema2;

public class EjercicioClase1 {
    public static void main(String[] args) {
        
        /*
            Nos piden comprobar un usuario y una contraseña.
            El usuario es fijo "usuario"
            Guardamos la contraseña en una variable como "12345678"
            Pedimos el usuario por teclado
            Pedimos la contraseña por teclado
            Si coinciden el usuario y la contraseña con los que tenemos guardado:
            - "Credenciales correctas, bienvenido"
            Si no
            - "Credenciales incorrectas"
    
        */
       String use ="usuario"
       String password = "12345678"
       String userNew;
       String passwordNew;

       userNew = IO.readln("Dime un usuario");
       passwordNew = IO.readln("Dime tu contraseña");

       if (user.toUpperCase().equals(userNew.toUpperCase())){
        if(password.equals(passwordNew)){
            IO.println("Creedenciales incorrectas");
        } else {
            IO.println("Creedenciales incorrectas");

        }
       }


    }
}