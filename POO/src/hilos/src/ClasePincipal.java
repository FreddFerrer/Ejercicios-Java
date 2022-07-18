public class ClasePincipal {
    public static void main(String[] args) {

        Proceso1 hilo1 = new Proceso1();    //esta forma solo es utilizando el extends thread

        Thread hilo2 = new Thread(new Proceso2());    //forma usando la funcion thread

        hilo1.start();

        hilo2.start();


    }
}

//Son dos formas de crear un hilo