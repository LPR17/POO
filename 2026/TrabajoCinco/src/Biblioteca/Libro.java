package Biblioteca;

public class Libro implements Comparable<Libro> {
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private String isbn;

    public Libro(String titulo, String autor, int anioPublicacion, String isbn){
        if(titulo == null || titulo.isBlank()) throw new IllegalArgumentException("El titulo no puede ser vacio");
        if(autor == null || autor.isBlank()) throw new IllegalArgumentException("El autor no puede ser vacio");
        if(isbn == null || isbn.isBlank()) throw new IllegalArgumentException("El isbn no puede ser vacio");
        if(anioPublicacion < 0) throw new IllegalArgumentException("El anio publicacion no puede ser negativo");

        this.titulo = titulo.trim();
        this.autor = titulo.trim();
        this.anioPublicacion = anioPublicacion;
        this.isbn = isbn.trim();
    }

// -- Getters --------
    public String getTitulo() {return titulo;}
    public String getAutor() {return autor;}
    public int getAnioPublicacion() {return anioPublicacion;}
    public String getIsbn() {return isbn;}

// -- Comparable: orden natural por ISBN --------
    @Override
    public int compareTo(Libro otro){return this.isbn.compareToIgnoreCase(otro.getIsbn());}
// -- Metodo toString para mostrar la información --------

    @Override
    public String toString() {
        return String.format(
                titulo, autor, anioPublicacion, isbn
        );
    }
}



