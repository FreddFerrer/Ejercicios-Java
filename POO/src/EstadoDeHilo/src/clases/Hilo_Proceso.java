package clases;

public class Hilo_Proceso extends Thread{

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(i + " " + getName());

            try {
                Hilo_Proceso.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println("ERROR en la clase " + e);
            }

        }
    }
}
