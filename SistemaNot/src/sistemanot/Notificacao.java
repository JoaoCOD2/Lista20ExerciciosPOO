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
public abstract class Notificacao {
    private String destinatario;
    private String mensagem;
    private String data;

    public Notificacao(String destinatario, String mensagem, String data) {
        this.destinatario = destinatario;
        this.mensagem = mensagem;
        this.data = data;
    }

    public abstract void enviar();

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
