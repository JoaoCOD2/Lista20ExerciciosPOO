/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoescola;

/**
 *
 * @author aluno.saolucas
 */
public class Coordenador extends Pessoa {

    public Coordenador(String nome, int idade) {
        super(nome, idade);
    }

    public void trabalhar() {
        System.out.println("Estou coordenando a escola.");
    }

    @Override
    public void apresentar() {
        System.out.println("Sou coordenador e meu nome é " + getNome());
    }
}
