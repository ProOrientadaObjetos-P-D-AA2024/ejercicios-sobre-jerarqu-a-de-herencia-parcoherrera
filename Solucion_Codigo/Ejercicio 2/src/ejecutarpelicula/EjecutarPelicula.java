package ejecutarpelicula;

public class EjecutarPelicula {

    public static void main(String[] args) {
        
        Soporte nitrato = new Soporte("Nitrato de Celulosa");
        Soporte acetato = new Soporte("Acetato de Celulosa");
        Soporte poliester = new Soporte("Poliéster");
        
        //Pelicula 1
        Dvd dvdPeli1 = new Dvd("Rapidos y Furiosos", "Rob Cohen", 2001,4.99, "4.7GB", "Español e Inglés.");
        Vhs vhsPeli1 = new Vhs("Rapidos y Furiosos", "Rob Cohen", 2001,4.99, nitrato, "Español");
        
        // Pelicula 2
        Dvd dvdPeli2 = new Dvd("Titanic", "James Cameron", 1997,4.99, "8.5GB", "Español, Inglés y Francés.");
        Vhs vhsPeli2 = new Vhs("Titanic", "James Cameron", 1997,4.99, acetato, "Inglés");
        
        // Pelicula 3
        Dvd dvdPeli3 = new Dvd("Akira", "Katsuhiro Ôtomo", 1988,4.99, "4.7GB", "Español y japonés.");
        Vhs vhsPeli3 = new Vhs("Akira", "Katsuhiro Ôtomo", 1988,4.99, poliester, "Japonés");
        
        //PRUEBA: Selecciono Película 2 en formato DVD
        
        System.out.println("Película Seleccionada: "+dvdPeli2.getTitulo());
        System.out.println("Director: "+dvdPeli2.getAutor());
        System.out.println("Año : "+dvdPeli2.getAnio());
        dvdPeli2.calcularPrecioAlquilerTotal();
        System.out.println("Precio de alquiler: "+dvdPeli2.getPrecioAlquilerTotal());
        System.out.println("Idiomas: "+dvdPeli2.getIdiomas());
        
    }
    
}
