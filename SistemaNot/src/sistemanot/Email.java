/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemanot;

/**
 *
 * @author joaop
 */
public class Email extends Notificacao {
    private String assunto;
    private String remetente;
    private String servidor;

    public Email(String destinatario, String mensagem, String data, String assunto, String remetente, String servidor) {
        super(destinatario, mensagem, data);
        this.assunto = assunto;
        this.remetente = remetente;
        this.servidor = servidor;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando EMAIL 📧");
        System.out.println("Para: " + getDestinatario());
        System.out.println("Assunto: " + assunto);
        System.out.println("Mensagem: " + getMensagem());
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }
}
