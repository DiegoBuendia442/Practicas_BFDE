import java.util.ArrayList;

class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    private String estado;

    // Constructor
    public Libro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.estado = "disponible";re
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getEstado() {
        return estado;
    }

    // Setter para el estado
    public void setEstado(String estado) {
        if (estado.equals("disponible") || estado.equals("prestado")) {
            this.estado = estado;
        }
    }

    // Métodos de cambio de estado
    public boolean prestar() {
        if (this.estado.equals("disponible")) {
            this.estado = "prestado";
            return true;
        }
        return false;
    }

    public boolean devolver() {
        if (this.estado.equals("prestado")) {
            this.estado = "disponible";
            return true;
        }
        return false;
    }
}

class Biblioteca {
    private ArrayList<Libro> coleccionLibros;

    // Constructor
    public Biblioteca() {
        this.coleccionLibros = new ArrayList<>();
    }

    // Método para agregar libro
    public void agregarLibro(Libro libro) {
        coleccionLibros.add(libro);
    }

    // Método para buscar libro por ISBN
    public Libro buscarLibroPorISBN(String isbn) {
        for (Libro libro : coleccionLibros) {
            if (libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }
        return null;
    }

    // Método para prestar libro
    public void prestarLibro(String isbn) {
        Libro libro = buscarLibroPorISBN(isbn);
        if (libro != null && libro.prestar()) {
            System.out.println("El libro '" + libro.getTitulo() + "' ha sido prestado.");
        } else {
            System.out.println("El libro no está disponible o no se encontró.");
        }
    }

    // Método para devolver libro
    public void devolverLibro(String isbn) {
        Libro libro = buscarLibroPorISBN(isbn);
        if (libro != null && libro.devolver()) {
            System.out.println("El libro '" + libro.getTitulo() + "' ha sido devuelto.");
        } else {
            System.out.println("El libro no se encontró o ya está disponible.");
        }
    }

    // Mostrar todos los libros
    public void mostrarLibros() {
        System.out.println("Colección de libros:");
        for (Libro libro : coleccionLibros) {
            System.out.println("• Título: " + libro.getTitulo());
            System.out.println("  Autor: " + libro.getAutor());
            System.out.println("  ISBN: " + libro.getIsbn());
            System.out.println("  Estado: " + libro.getEstado());
            System.out.println("------------------------------");  // Separador entre libros
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Crear biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Añadir libros a la biblioteca
        Libro libro1 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", "12345");
        Libro libro2 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", "67890");
        Libro libro3 = new Libro("El Principito", "Antoine de Saint-Exupéry", "54321");

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);

        // Mostrar colección inicial de libros
        biblioteca.mostrarLibros();

        // Prestar un libro
        String isbnPrestar = "12345";
        System.out.println("\nIntentando prestar el libro con ISBN " + isbnPrestar + ":");
        biblioteca.prestarLibro(isbnPrestar);

        // Mostrar colección después de prestar un libro
        biblioteca.mostrarLibros();

        // Devolver el libro
        String isbnDevolver = "12345";
        System.out.println("\nIntentando devolver el libro con ISBN " + isbnDevolver + ":");
        biblioteca.devolverLibro(isbnDevolver);

        // Mostrar colección después de devolver el libro
        biblioteca.mostrarLibros();
    }
}
