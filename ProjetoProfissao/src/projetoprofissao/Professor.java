/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoprofissao;

/**
 *
 * @author joaop
 */
public class Professor extends Profissao {
    private String disciplina;
    private int cargaHoraria;
    private String instituicao;

    public Professor(String nome, String area, double salario, String disciplina, int cargaHoraria, String instituicao) {
        super(nome, area, salario);
        this.disciplina = disciplina;
        this.cargaHoraria = cargaHoraria;
        this.instituicao = instituicao;
    }

    @Override
    public void executarTrabalho() {
        System.out.println(getNome() + " está dando aula 📚");
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}
