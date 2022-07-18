public class PasarPorReferencia {
    public static void main(String[] args) {
        int[] edad = {10, 11, 12};

        System.out.println("iniciamos el metodo main");
        //mostramos cada valor
        for (int i = 0; i < edad.length; i++) {
            System.out.println("edad " + (i+1) + " = " + edad[i]);
        }
        System.out.println("iniciamos metodo test");
        test(edad);

        //despues de llamar al metodo test
        //otra forma de mostrar
        for (int i: edad){
            System.out.println("edad " + i);
        }


    }

    public static void test(int[] edadArray) {
        for (int i = 0; i < edadArray.length; i++) {
            edadArray[i] = edadArray[i] + 20;
            System.out.println("edad " + (i+1) + " = " + edadArray[i]);
        }
        System.out.println("fin del metodo test");
    }
}
