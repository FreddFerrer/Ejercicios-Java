package password;

public class Password {

    private final static int LONGITUD = 8;
    private String contraseña;
    private int longitud;

    public Password() {
        this(LONGITUD);
    }


    public Password(int longitud) {
        this.longitud = longitud;
        contraseña = generarPassword();
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    //COMPUREBA SI LA CONTRASEÑA ES FEURTE
    public boolean esFuerte(){
        int cuentNumeros = 0;
        int cuentaMinusculas = 0;
        int cuentaMayusculas = 0;
        char clave;

        for (int i = 0; i < contraseña.length(); i++){
            clave = contraseña.charAt(i);
            String passValue = String.valueOf(clave);

            if (passValue.matches("[a-z]")) {
                cuentaMinusculas++;
            } else if (passValue.matches("[A-Z]")) {
                cuentaMayusculas++;
            } else {
                cuentNumeros++;
            }
        }

        if (cuentaMayusculas > 2 && cuentaMinusculas > 1 && cuentNumeros > 5) {
            return true;
        } else {
            return false;
        }
    }

    public String generarPassword(){
        String password = "";

        for (int i = 0; i < longitud; i++){
            int eleccion = (int) Math.floor(Math.random() * 3 + 1);

            if (eleccion == 1) {
                char minusculas = (char) ((int)Math.floor(Math.random() * (123-97) + 97));
                password += minusculas;
            } else {
                if (eleccion == 2) {
                    char mayusculas = (char) ((int)Math.floor(Math.random() * (91-65) + 65));
                    password += mayusculas;
                } else {
                    char numeros = (char) ((int)Math.floor(Math.random() * (58-48) + 48));
                    password += numeros;
                }
            }
        }
        return password;
    }


}
