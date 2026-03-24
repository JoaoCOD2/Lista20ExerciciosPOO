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
public class ProjetoEscola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa p1 = new Aluno("João", 16, 8.0, 7.0);
        Pessoa p2 = new Professor("Carlos", 40, "Matemática");
        Pessoa p3 = new Coordenador("Ana", 45);

        p1.apresentar();
        p2.apresentar();
        p3.apresentar();

        System.out.println("-----");

        Professor prof = new Professor("Carlos", 40, "Matemática");
        Turma turma = new Turma("1º Ano", prof);

        Aluno a1 = new Aluno("João", 16, 8, 7);
        Aluno a2 = new Aluno("Maria", 17, 9, 6);

        turma.adicionarAluno(a1);
        turma.adicionarAluno(a2);

        turma.listarAlunos();
    }
}
