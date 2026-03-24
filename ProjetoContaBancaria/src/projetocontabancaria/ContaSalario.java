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
public class ContaSalario extends ContaBancaria {

    public ContaSalario(int numero, Cliente titular) {
        super(numero, titular);
    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado (Conta Salário).");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}
