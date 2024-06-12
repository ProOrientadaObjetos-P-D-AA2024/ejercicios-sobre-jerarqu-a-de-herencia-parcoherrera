package ejecutartrabajadores;

public class FijoMensual extends Trabajador {

    private double salario;
    protected Jefe jefe;
    
    public FijoMensual(String nombres, String apellidos, String direccion, String dni, double salario, Jefe jefe) {
        super(nombres, apellidos, direccion, dni);
        this.salario = salario;
        this.jefe = jefe;
    }

    

}
