import java.util.Scanner;

public class OrderNums {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[10];


        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese el numero " + (i+1)+":" );
            numeros[i] = entrada.nextInt();
        }

        System.out.println("resultado:");
        for (int i = 0; i <= 4; i++) {
            System.out.println(numeros[9-i]);
            System.out.println(numeros[i]);
        }
    }
}
