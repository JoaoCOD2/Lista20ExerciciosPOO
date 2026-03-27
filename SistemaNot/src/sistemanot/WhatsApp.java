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
public class WhatsApp extends Notificacao {
    private String numero;
    private boolean confirmado;
    private String status;

    public WhatsApp(String destinatario, String mensagem, String data, String numero, boolean confirmado, String status) {
        super(destinatario, mensagem, data);
        this.numero = numero;
        this.confirmado = confirmado;
        this.status = status;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando WhatsApp 💬");
        System.out.println("Número: " + numero);
        System.out.println("Mensagem: " + getMensagem());
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
