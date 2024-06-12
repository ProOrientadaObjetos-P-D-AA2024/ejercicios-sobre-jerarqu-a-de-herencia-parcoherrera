package ejecutarpelicula;

public class Pelicula {
    
    protected String titulo;
    protected String autor;
    protected int anio;
    protected double precioAlquiler;

    public Pelicula(String titulo, String autor, int anio, double precioAlquiler) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        this.precioAlquiler = precioAlquiler;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnio() {
        return anio;
    }

    public double getPrecioAlquiler() {
        return precioAlquiler;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setPrecioAlquiler(double precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }
    
    
    
    
}
