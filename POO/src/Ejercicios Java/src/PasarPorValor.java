public class PasarPorValor {
    public static void main(String[] args) {
        int num = 10;

        System.out.println("el numero es " + num);
        imprimir(num);
        System.out.println("num finaliza en el main  = " + num);

    }

    public static void imprimir(int num){
        System.out.println("el numero es " + num);
        num = 23;
        System.out.println("la funcion finaliza con num = " + num);
    }
}
