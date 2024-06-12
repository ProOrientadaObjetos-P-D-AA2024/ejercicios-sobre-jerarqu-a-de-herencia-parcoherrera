package ejecutartrabajadores;

public class Trabajador {

    
    protected String nombres;
    protected String apellidos;
    protected String direccion;
    protected String dni;

    public Trabajador(String nombres, String apellidos, String direccion, String dni) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    
    
}
