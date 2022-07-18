package clases;
import java.lang.*;

public class MainClass {
    public static void main(String[] args) {

        Hilo_Proceso hilo1 = new Hilo_Proceso();   //El hilo no está en ejecucion pero si esta creado

        Hilo_Proceso hilo2 = new Hilo_Proceso();    //El hilo no está en ejecucion pero si esta creado


        hilo1.start();          //Ejecutamos el hilo


        try {
            hilo1.sleep(1000);                    //bloqueamos el funcionamiento del programa durante 3 segundos
        } catch (InterruptedException e) {
            System.out.println("ERROR en el hilo1 " + e);
        }


        hilo2.start();          //Ejecutamos el hilo

        try {
            hilo2.sleep(1000);              //bloqueamos el funcionamiento del programa durante 2 segundos
        } catch (InterruptedException e) {
            System.out.println("ERROR en el hilo2 " + e);
        }

    }

}
