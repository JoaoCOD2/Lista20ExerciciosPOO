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
public class ProjetoContaBancaria {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("João", "123.456.789-00");

        ContaBancaria conta1 = new ContaCorrente(1, cliente);
        ContaBancaria conta2 = new ContaPoupanca(2, cliente);
        ContaBancaria conta3 = new ContaSalario(3, cliente);

        conta1.depositar(100);
        conta1.sacar(50);
        conta1.consultarSaldo();

        System.out.println("-----");

        conta2.depositar(200);
        ((ContaPoupanca) conta2).render(); 
        conta2.consultarSaldo();

        System.out.println("-----");

        conta3.depositar(300);
        conta3.sacar(100);
        conta3.consultarSaldo();
    }
}
