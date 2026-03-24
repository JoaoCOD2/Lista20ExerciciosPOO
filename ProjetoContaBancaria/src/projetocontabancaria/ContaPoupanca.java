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
public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(int numero, Cliente titular) {
        super(numero, titular);
    }

    public void render() {
        saldo += saldo * 0.02; // 2% de rendimento
        System.out.println("Rendimento aplicado.");
    }
}
