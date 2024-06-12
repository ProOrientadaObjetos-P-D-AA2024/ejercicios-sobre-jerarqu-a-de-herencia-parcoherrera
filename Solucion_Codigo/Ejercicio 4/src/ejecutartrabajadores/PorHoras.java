package ejecutartrabajadores;

public class PorHoras extends Trabajador {

    private int horasMes;
    private double salario;
    protected Jefe jefe;

    public PorHoras(String nombres, String apellidos, String direccion, String dni, int horasMes, Jefe jefe) {
        super(nombres, apellidos, direccion, dni);
        this.horasMes = horasMes;
        this.jefe = jefe;
    }

    public int getHorasMes() {
        return horasMes;
    }

    public void setHorasMes(int horasMes) {
        this.horasMes = horasMes;
    }

    public double getSalario() {
        return salario;
    }

    public void calcularSalario() {
        if (horasMes<=40) {
            salario = horasMes * 8; //Paga $8 la hora
        }else{
            salario = horasMes * 7; //Paga $7 la hora
        }
    }
    
    
    

}
