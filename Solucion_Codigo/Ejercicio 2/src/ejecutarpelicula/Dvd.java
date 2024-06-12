package ejecutarpelicula;

public class Dvd extends Pelicula {
    
    // Los DVDs pueden venir en 2 capacidades:
    // Normales:4.7GB
    // Doble capa: 8,5GB
    // https://www.deskidea.com/blog/capacidad-de-un-cd-y-un-dvd/#google_vignette
    
    private String capacidad;
    private String idiomas;
    private double precioAlquilerTotal;

    public Dvd(String titulo, String autor, int anio, double precioAlquiler, String capacidad, String idiomas) {
        super(titulo, autor, anio, precioAlquiler);
        this.capacidad = capacidad;
        this.idiomas = idiomas;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public String getIdiomas() {
        return idiomas;
    }

    public double getPrecioAlquilerTotal() {
        return precioAlquilerTotal;
    }

    public void calcularPrecioAlquilerTotal() {
        precioAlquilerTotal = precioAlquiler +(precioAlquiler/10);
    }
    
    
    
    
    
}
