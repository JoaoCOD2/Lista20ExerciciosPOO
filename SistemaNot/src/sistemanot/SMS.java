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
public class SMS extends Notificacao {
    private String numeroTelefone;
    private String operadora;
    private boolean internacional;

    public SMS(String destinatario, String mensagem, String data, String numeroTelefone, String operadora, boolean internacional) {
        super(destinatario, mensagem, data);
        this.numeroTelefone = numeroTelefone;
        this.operadora = operadora;
        this.internacional = internacional;
    }

    SMS(String joão, String seu_código_é_1234, String string, String string0, String vivo, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void enviar() {
        System.out.println("Enviando SMS 📱");
        System.out.println("Número: " + numeroTelefone);
        System.out.println("Mensagem: " + getMensagem());
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }
}
