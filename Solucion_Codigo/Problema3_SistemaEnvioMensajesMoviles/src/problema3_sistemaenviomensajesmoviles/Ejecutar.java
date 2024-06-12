
package problema3_sistemaenviomensajesmoviles;

import java.util.Scanner;

public class Ejecutar {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String remitente = "";
        String destinatario = "";
        int numeroRemitente;
        int numeroDestinatario;
        String opcion;
        int opcionM;
        
        System.out.println("Ingrese su número de telefono");
        numeroRemitente = entrada.nextInt();
        entrada.nextLine();
        System.out.println("¿Desea agregar su nombre? (s/n) ");
        opcion = entrada.nextLine();
        if (opcion.equals("s")) {
            System.out.println("Ingrese su nombre");
            remitente = entrada.nextLine();
        }
        System.out.println("Ingrese el número del destinatario");
        numeroDestinatario = entrada.nextInt();
        entrada.nextLine();
        System.out.println("¿Desea agregar el nombre del destinatario? (s/n) ");
        opcion = entrada.nextLine();
        if (opcion.equals("s")) {
            System.out.println("Ingrese el nombre del destinatario");
            remitente = entrada.nextLine();
        }
        
        System.out.println("Ingrese un numero según su tipo de mensaje que desea ingresar");
        System.out.println("1. Mensaje de texto (SMS)");
        System.out.println("2. Mensaje con imagén (MMS)");
        opcionM = entrada.nextInt();
        
        entrada.nextLine();
        
        System.out.println("---------------------------Sistema de envio de Mensajes-------------------------------");
        switch (opcionM) {
            case 1:
                MensajesTextoSMS mensajeTexto = new MensajesTextoSMS(remitente, destinatario, numeroRemitente, numeroDestinatario);
                mensajeTexto.enviarMensaje();
                System.out.println("\n" + mensajeTexto.toString() + "\n* SMS:\n" + mensajeTexto.visualizarMensaje());
                break;
            case 2:
                System.out.println("");
                MensajesConImagenes_MMS mensajeImagenes = new MensajesConImagenes_MMS(remitente, destinatario, numeroRemitente, numeroDestinatario);
                mensajeImagenes.enviarImagen();
                System.out.println("\n"+mensajeImagenes.toString() + "\n* MMS:\n" + mensajeImagenes.visualizarImagen());
                break;
            default:
                throw new AssertionError();
        }
        
    }

}
