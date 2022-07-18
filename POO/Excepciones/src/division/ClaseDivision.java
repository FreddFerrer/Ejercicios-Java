package division;
import java.util.Scanner;

public class ClaseDivision {
    public static void main(String[] args) {


        try{
            int valor1, valor2, resultado;
            Scanner entrada = new Scanner(System.in);

            System.out.println("Dame el primer valor: ");
            valor1 = entrada.nextInt();

            System.out.println("Dame el segundo valor: ");
            valor2 = entrada.nextInt();

            resultado = valor1 / valor2;

            System.out.println("Resultado de la division es " + resultado);
        } catch (Exception e) {
            System.out.println("ERROR. " + e);
        } finally {                                     //se ejecuta si o si
            System.out.println("Operacion concluida");
        }


    }
}
