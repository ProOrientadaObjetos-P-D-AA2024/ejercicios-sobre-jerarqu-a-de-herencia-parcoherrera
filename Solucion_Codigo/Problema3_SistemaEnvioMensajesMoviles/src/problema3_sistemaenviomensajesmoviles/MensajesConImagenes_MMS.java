package problema3_sistemaenviomensajesmoviles;

import java.util.Scanner;

public class MensajesConImagenes_MMS extends MensajeMovil {

    private String nombreDeLaImagen;

    public MensajesConImagenes_MMS(String remitente, String destinatario, int numeroMovilRemitente, int numeroMovilDestinatario) {
        super(remitente, destinatario, numeroMovilRemitente, numeroMovilDestinatario);
    }

    public void enviarImagen() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la imagen que se desee enviar");
        String mensaje = entrada.nextLine();
        mensaje = mensaje + ".png";
        nombreDeLaImagen = mensaje;
    }

    public String visualizarImagen() {
        return nombreDeLaImagen;
    }
}
