import java.util.Scanner;

public class StadicArray {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[7];
        int numerosPositivos = 0, acumPos = 0;
        int numerosNegativos = 0, acumNeg = 0;
        int numeros0 = 0, acum0 = 0;

        for (int i = 0; i < numeros.length; i++){
            System.out.println("Ingrese el num " + (i+1));
            numeros[i] = entrada.nextInt();
        }

        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] > 0){
                numerosPositivos++;
                acumPos = acumPos + numeros[i];
            } else if (numeros[i] < 0){
                numerosNegativos++;
                acumNeg = acumNeg + numeros[i];
            } else {
                numeros0++;
                acum0 = acum0 + numeros[i];
            }
        }

        float sumaResltado = acumPos / numerosPositivos;
        float restaResultado = acumNeg / numerosNegativos;

        System.out.println("el promedio de los positivos es " + sumaResltado);
        System.out.println("el promedio de los negativos es " + (restaResultado * -1));
    }
}
