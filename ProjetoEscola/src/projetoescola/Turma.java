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
import java.util.ArrayList;

public class Turma {
    private String nome;
    private Professor professor;
    private ArrayList<Aluno> alunos;

    public Turma(String nome, Professor professor) {
        this.nome = nome;
        this.professor = professor;
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void listarAlunos() {
        System.out.println("Alunos da turma " + nome + ":");
        for (Aluno a : alunos) {
            System.out.println("- " + a.getNome() + " | Média: " + a.calcularMedia());
        }
    }
}
