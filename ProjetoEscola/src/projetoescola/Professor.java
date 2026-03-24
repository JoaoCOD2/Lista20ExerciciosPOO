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
public class Professor extends Pessoa {
    private String disciplina;

    public Professor(String nome, int idade, String disciplina) {
        super(nome, idade);
        this.disciplina = disciplina;
    }

    public void trabalhar() {
        System.out.println("Estou dando aula de " + disciplina);
    }

    @Override
    public void apresentar() {
        System.out.println("Sou professor de " + disciplina + " e meu nome é " + getNome());
    }
}
