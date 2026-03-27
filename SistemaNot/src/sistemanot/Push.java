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
public class Push extends Notificacao {
    private String app;
    private String dispositivo;
    private boolean prioridadeAlta;

    public Push(String destinatario, String mensagem, String data, String app, String dispositivo, boolean prioridadeAlta) {
        super(destinatario, mensagem, data);
        this.app = app;
        this.dispositivo = dispositivo;
        this.prioridadeAlta = prioridadeAlta;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando notificação PUSH 🔔");
        System.out.println("App: " + app);
        System.out.println("Mensagem: " + getMensagem());
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }
}
