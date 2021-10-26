package password;

import javax.swing.*;

public class PasswordMain {
    public static void main(String[] args) {

        String texto = JOptionPane.showInputDialog("Introduce el temaño del array");
        int tamanio = Integer.parseInt(texto);

        texto = JOptionPane.showInputDialog("Introduce la lopngitud del password");
        int longitud = Integer.parseInt(texto);

        Password listaPassword[] = new Password[tamanio];
        boolean fortalezaPass[] = new boolean [tamanio];

        for (int i= 0; i < listaPassword.length; i++) {
            listaPassword[i] = new Password(longitud);
            fortalezaPass[i] = listaPassword[i].esFuerte();
            System.out.println(listaPassword[i].getContraseña() + " " + fortalezaPass[i]);
        }


    }

}
