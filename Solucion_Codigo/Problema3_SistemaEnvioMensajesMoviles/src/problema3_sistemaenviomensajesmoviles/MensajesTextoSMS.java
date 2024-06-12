package problema3_sistemaenviomensajesmoviles;

import java.util.Scanner;

public class MensajesTextoSMS extends MensajeMovil {

    private String contenidoMensaje;

    public MensajesTextoSMS(String remitente, String destinatario, int numeroMovilRemitente, int numeroMovilDestinatario) {
        super(remitente, destinatario, numeroMovilRemitente, numeroMovilDestinatario);
    }

    
    public void enviarMensaje() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el mensaje que se desea enviar");
        String mensaje = entrada.nextLine();
        contenidoMensaje = mensaje;
    }

    public String visualizarMensaje() {
        return contenidoMensaje;
    }
}
