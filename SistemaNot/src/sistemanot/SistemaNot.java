/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemanot;

import java.util.ArrayList;

/**
 *
 * @author joaop
 */
public class SistemaNot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Notificacao> notificacoes = new ArrayList<>();

        notificacoes.add(new Email("joao@email.com", "Bem-vindo!", "27/03/2026", "Cadastro", "Sistema", "Gmail"));
        notificacoes.add(new SMS("João", "Seu código é 1234", "27/03/2026", "51999999999", "Vivo", false));
        notificacoes.add(new WhatsApp("Maria", "Oi, tudo bem?", "27/03/2026", "51988888888", true, "Enviado"));
        notificacoes.add(new Push("Usuário", "Nova mensagem recebida", "27/03/2026", "Instagram", "Android", true));

        for (Notificacao n : notificacoes) {
            n.enviar();
            System.out.println("----------------------");
        }
    }
}
