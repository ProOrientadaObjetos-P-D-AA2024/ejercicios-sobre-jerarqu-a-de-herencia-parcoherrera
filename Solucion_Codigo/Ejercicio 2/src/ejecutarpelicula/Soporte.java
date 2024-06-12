package ejecutarpelicula;

public class Soporte {
    
    // Los soportes pueden ser:
    // 1. Nitrato de celulosa plastificado
    // 2. Acetato de celulosa plastificado
    // 3. Poliester
    // https://csdehesa.wordpress.com/2016/05/18/soportes-de-pelicula/
    
    private String tipo;

    public Soporte(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
    
}
