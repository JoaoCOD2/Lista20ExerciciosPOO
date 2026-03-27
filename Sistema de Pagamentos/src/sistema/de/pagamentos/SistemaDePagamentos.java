/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.de.pagamentos;

import java.util.ArrayList;

/**
 *
 * @author joaop
 */
public class SistemaDePagamentos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Pagamento> pagamentos = new ArrayList<>();

        pagamentos.add(new CartaoCredito(150.0, "26/03/2026", "Compra online", "1234-5678", "João", "Visa"));
        pagamentos.add(new Pix(75.0, "26/03/2026", "Pagamento rápido", "joao@email.com", "Nubank", "Email"));
        pagamentos.add(new Boleto(200.0, "26/03/2026", "Conta de luz", "123456789", "30/03/2026", "Caixa"));
        pagamentos.add(new Dinheiro(50.0, "26/03/2026", "Lanche", 100.0, "Real"));

        for (Pagamento p : pagamentos) {
            p.processarPagamento();
            System.out.println("-----------------------");
        }
    }
}
