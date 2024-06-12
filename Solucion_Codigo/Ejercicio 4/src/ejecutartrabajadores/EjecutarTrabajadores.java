package ejecutartrabajadores;

public class EjecutarTrabajadores {

    public static void main(String[] args) {
        
        //Dar de alta a 2 trabajadores
        
        //Jefe
        Jefe jefe1 = new Jefe("Alfonso", "Espinoza", "Argelia", "1157443992", 1256.54);
        
        //Comisionista
        Comisionista trabajador1 = new Comisionista("Rodrigo", "Mendieta", "Las Pitas", "0987656634", 15,10567.96, jefe1);
        trabajador1.calclularSalario();
        
        //Imprimir nomina
        
        //Jefe
        System.out.println("JEFE");
        System.out.println("Nombres: " + jefe1.getNombres());
        System.out.println("Apellidos: "+ jefe1.getApellidos());
        System.out.println("Direccion: "+jefe1.getDireccion());
        System.out.println("Dni: "+jefe1.getDni());
        System.out.println("Sueldo: "+jefe1.getSueldo());
        System.out.println("");
        
        //Comisionista
        System.out.println("COMISIONISTA");
        System.out.println("Nombres: " + trabajador1.getNombres());
        System.out.println("Apellidos: "+ trabajador1.getApellidos());
        System.out.println("Direccion: "+trabajador1.getDireccion());
        System.out.println("Dni: "+trabajador1.getDni());
        System.out.println("Porcentaje de comision: "+trabajador1.getPorcentajeComision());
        System.out.println("Total ventas"+trabajador1.getTotalVentas());
        System.out.println("Sueldo: "+trabajador1.getSalario());
        
        
    }
    
}
