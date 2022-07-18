public class PasoPorReferencia2 {
    public static void main(String[] args) {

        Persona persona1 = new Persona();
        persona1.modificarNombre("Ricardo");
        System.out.println(persona1.getNombre());

        persona1.setNombre("Miriam");
        System.out.println(persona1.getNombre());
    }
}

class Persona {
    private String nombre;

    public void modificarNombre(String nombreNuevo) {
        nombre = nombreNuevo;       //si la variable global es igual al parametro tengo que poner this.
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
