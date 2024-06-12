package ejecutartrabajadores;

public class Jefe extends Trabajador {

    private double sueldo;
    
    public Jefe(String nombres, String apellidos, String direccion, String dni, double sueldo) {
        super(nombres, apellidos, direccion, dni);
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    

}
