// Crear una aplicación que nos permite insertar números hasta que insertemos un -1.
// Calcular el numero de números introducidos.

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {


        int numerosIntroducidos = 0;
        calculo(numerosIntroducidos);

    }

    public static void calculo(int nummIntro) {
        ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
        Scanner entrada = new Scanner(System.in);
        int nume = 0;
        do {
            System.out.println("Ingrese un numero");
            nume = entrada.nextInt();
            if (nume != -1) {
                listaNumeros.add(nume);
                nummIntro++;
            } else {
                break;
            }
        } while (nume != -1);
        System.out.println("cantidad de numeros: " + nummIntro);

        System.out.println("Los numeros son: ");
        for (int i: listaNumeros){
            System.out.println(i);
        }
    }
}
