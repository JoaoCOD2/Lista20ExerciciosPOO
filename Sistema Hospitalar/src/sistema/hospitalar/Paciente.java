/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.hospitalar;

/**
 *
 * @author joaop
 */
public class Paciente extends Pessoa {
    private String sintomas;
    private String historico;
    private String convenio;

    public Paciente(String nome, int idade, String cpf, String sintomas, String historico, String convenio) {
        super(nome, idade, cpf);
        this.sintomas = sintomas;
        this.historico = historico;
        this.convenio = convenio;
    }

    @Override
    public void realizarAtendimento() {
        System.out.println(getNome() + " está sendo atendido.");
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }
}
