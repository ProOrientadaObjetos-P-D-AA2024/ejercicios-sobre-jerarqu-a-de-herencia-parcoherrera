package ejecutarpelicula;

public class Vhs extends Pelicula {
    
    private Soporte tipoSoporte;
    private String idioma;

    public Vhs(String titulo, String autor, int anio, double precioAlquiler, Soporte tipoSoporte, String idioma) {
        super(titulo, autor, anio, precioAlquiler);
        this.tipoSoporte = tipoSoporte;
        this.idioma = idioma;
    }

    public Soporte getTipoSoporte() {
        return tipoSoporte;
    }

    public String getIdioma() {
        return idioma;
    }
    
    
    
    
}
