/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocontabancaria;

/**
 *
 * @author aluno.saolucas
 */
public class ContaCorrente extends ContaBancaria {

    public ContaCorrente(int numero, Cliente titular) {
        super(numero, titular);
    }

    @Override
    public void sacar(double valor) {
        double taxa = 2.0;
        double total = valor + taxa;

        if (saldo >= total) {
            saldo -= total;
            System.out.println("Saque com taxa realizado. Taxa: R$" + taxa);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}
