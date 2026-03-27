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
public class Engenheiro extends Profissao {
    private String especialidade;
    private String projeto;
    private String empresa;

    public Engenheiro(String nome, String area, double salario, String especialidade, String projeto, String empresa) {
        super(nome, area, salario);
        this.especialidade = especialidade;
        this.projeto = projeto;
        this.empresa = empresa;
    }

    @Override
    public void executarTrabalho() {
        System.out.println(getNome() + " está desenvolvendo um projeto 🏗️");
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
