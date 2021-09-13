import java.util.Scanner;

public class Libro {
    private String titulo;
    private String autor;
    private int ejemplares;
    private int prestados;
    private int disponibles;

    //CONSTRUCTOR POR DEFECTO
    public Libro() {
    }

    //CONTRUCTOR CON PARAMETROS
    public Libro(String titulo, String autor, int ejemplares, int prestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.prestados = prestados;
    }

    public void Prestamo() {
        if (ejemplares < 1) {
            System.out.println("No quedan suficientes ejemplares para prestar");
        } else {
            prestados++;
            disponibles = ejemplares - prestados;
            System.out.println("Prestamo realizado con exito");
            System.out.println("ejemplares = " + ejemplares);
            System.out.println("prestados = " + prestados);
            System.out.println("disponibles para prestar = " + disponibles);
        }
    }

    public void Devolucion() {
        if (prestados <= 0) {
            System.out.println("ERROR");
        } else {
            prestados--;
            disponibles = ejemplares + prestados;
            System.out.println("Devolucion realizada con exito");
            System.out.println("ejemplares = " + ejemplares);
            System.out.println("prestados = " + prestados);
            System.out.println("disponibles para prestar = " + disponibles);
        }
    }
    @Override
    public String toString() {
        return "Titulo: " + titulo + "\nautor: " + autor + "\nejemplares: " + ejemplares +
                "\nprestados: " + prestados + "\ndisponibles para pestar: " + disponibles;
    }

    public int getDisponibles() {
        return disponibles;
    }

    public void setDisponibles(int disponibles) {
        this.disponibles = disponibles;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    public void setPrestados(int prestados) {
        this.prestados = prestados;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public int getPrestados() {
        return prestados;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String titulo, autor;
        int ejemplares;

        Libro libro1 = new Libro("1984", "Freddy Ferreira", 5, 1);

        System.out.println("Libro 1:");
        System.out.println("Titulo: " + libro1.getTitulo());
        System.out.println("Autor: " + libro1.getAutor());
        System.out.println("Ejemplares: " + libro1.getEjemplares());
        System.out.println("Prestados: " + libro1.getPrestados());
        System.out.println();

        libro1.Devolucion();

        Libro libro2 = new Libro();

        System.out.println("Ingrese el titulo del libro: ");
        titulo = entrada.nextLine();
        System.out.println("Ingrese el nombre del autor: ");
        autor = entrada.nextLine();
        System.out.println("Ingrese la cantidad de ejmplares: ");
        ejemplares = entrada.nextInt();

        libro2.setTitulo(titulo);
        libro2.setAutor(autor);
        libro2.setEjemplares(ejemplares);

        System.out.println("Libro 2:");
        System.out.println("Titulo: " + libro2.getTitulo());
        System.out.println("Autor: " + libro2.getAutor());
        System.out.println("Ejemplares: " + libro2.getEjemplares());
        System.out.println("Prestados: " + libro2.getPrestados());
        System.out.println();

        libro2.Prestamo();

    }
}
