/*Crea una clase llamada Contador que contenga un único atributo entero llamado cont.
La clase tendrá los siguientes constructores:
Constructor por defecto
Constructor con parámetros para inicializar el contador con un valor no negativo. Si el valor inicial que se
recibe es negativo el contador tomará el valor cero como valor inicial.
Constructor copia.
Además de los métodos getter y setter, la clase contendrá los métodos:
incrementar: incrementa el contador en una unidad.
decrementar: decrementa el contador en una unidad. El contador nunca podrá tener un valor negativo.
Si al decrementar se alcanza un valor negativo el contador toma el valor cero.
Una vez creada la clase, escribe un método main para probar la clase.*/

import java.util.Scanner;

public class Contador {

    //ATRIBUTOS
    private int cont;

    //CONSTRUCTOR POR DEFECTO
    public Contador() {
    }

    //CONSTRUCTOR CON PARAMETROS PARA INICIALIZAR EL CONT CON VALOR != 0
    public Contador(int cont) {
        if (cont < 0) {
            this.cont = 0;
        } else {
            this.cont = cont;
        }
    }

    //CONSTRUCTOR COPIA
    public Contador(Contador c){
        this.cont = c.cont;
    }

    //GETTER Y SETTER
    public void setCont(int cont) {
        this.cont = cont;
    }

    public int getCont() {
        return cont;
    }

    public void incrementar(){
        cont++;
    }

    public void decrementar(){
        cont--;
        if (cont < 0){
            cont = 0;
        }
    }

    public static void main(String[] args) {

        int n;
        Scanner entrada = new Scanner(System.in);

        Contador contador1 = new Contador();

        System.out.println("Introduce un valor para iniciaizar el contador: ");
        n = entrada.nextInt();

        contador1.setCont(n);
        contador1.incrementar();
        System.out.println(contador1.getCont());

        contador1.incrementar();
        contador1.incrementar();

        System.out.println(contador1.getCont());

        contador1.decrementar();

        System.out.println(contador1.getCont());

        Contador contador2 = new Contador(88);

        contador2.incrementar();
        contador2.incrementar();
        contador2.incrementar();

        System.out.println(contador2.getCont());
    }
}
