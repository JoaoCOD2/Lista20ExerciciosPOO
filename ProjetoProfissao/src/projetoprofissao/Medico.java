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
public class Medico extends Profissao {
    private String especialidade;
    private int crm;
    private String hospital;

    public Medico(String nome, String area, double salario, String especialidade, int crm, String hospital) {
        super(nome, area, salario);
        this.especialidade = especialidade;
        this.crm = crm;
        this.hospital = hospital;
    }

    @Override
    public void executarTrabalho() {
        System.out.println(getNome() + " está atendendo pacientes 🏥");
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
