package password;

public class Password {

    private int LONGITUD = 8;
    private String contraseña;



    public Password() {
    }

    public Password(int LONGITUD) {
        this.LONGITUD = LONGITUD;
    }

    public int getLONGITUD() {
        return LONGITUD;
    }

    public void setLONGITUD(int LONGITUD) {
        this.LONGITUD = LONGITUD;
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

        if (cuentaMayusculas >= 2 && cuentaMinusculas >= 1 && cuentNumeros >= 5) {
            return true;
        } else {
            return false;
        }
    }

    
}
