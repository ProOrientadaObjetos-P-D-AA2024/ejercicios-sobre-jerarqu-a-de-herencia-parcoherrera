
package problema3_sistemaenviomensajesmoviles;

public class MensajeMovil {
    protected String remitente;
    protected String destinatario;
    protected int numeroMovilRemitente;
    protected int numeroMovilDestinatario;

    public MensajeMovil(String remitente, String destinatario, int numeroMovilRemitente, int numeroMovilDestinatario) {
        this.remitente = remitente;
        this.destinatario = destinatario;
        this.numeroMovilRemitente = numeroMovilRemitente;
        this.numeroMovilDestinatario = numeroMovilDestinatario;
    }
    
    
    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public int getNumeroMovilDestinatario() {
        return numeroMovilDestinatario;
    }

    public void setNumeroMovilDestinatario(int numeroMovilDestinatario) {
        this.numeroMovilDestinatario = numeroMovilDestinatario;
    }
    
    public int getNumeroMovilRemitende() {
        return numeroMovilRemitente;
    }

    public void setNumeroMovilRemitente(int numeroMovilRemitente){
        this.numeroMovilRemitente = numeroMovilRemitente;
    }
    
    
    @Override
    public String toString(){
        if (destinatario.equals("")) {
            destinatario = "Anonimo";
        }
        if (remitente.equals("")) {
            remitente = "Anomino";
        }
        
        String cadena = String.format("Mensaje enviado a : %s\n"
                + "Número del destinatario: %s\n"
                + "Por: %s\n"
                + "Numero del remitente: %s\n",
                destinatario,
                numeroMovilDestinatario,
                remitente,
                numeroMovilRemitente);
        return cadena;
    }
}
