package ejecutartrabajadores;

public class Comisionista extends Trabajador {

    private double porcentajeComision;
    private double totalVentas;
    private double salario;
    protected Jefe jefe;
    
    
    public Comisionista(String nombres, String apellidos, String direccion, String dni, double porcentajeComision, double totalVentas, Jefe jefe) {
        super(nombres, apellidos, direccion, dni);
        this.porcentajeComision = porcentajeComision;
        this.totalVentas = totalVentas;
        this.jefe = jefe;
    }

    public double getPorcentajeComision() {
        return porcentajeComision;
    }

    public void setPorcentajeComision(double porcentajeComision) {
        this.porcentajeComision = porcentajeComision;
    }

    public double getTotalVentas() {
        return totalVentas;
    }

    public void setTotalVentas(double totalVentas) {
        this.totalVentas = totalVentas;
    }

    public double getSalario() {
        return salario;
    }

    public void calclularSalario() {
        salario = totalVentas/porcentajeComision;
    }

    

}
