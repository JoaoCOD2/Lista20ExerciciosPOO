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
public class Medico extends Pessoa {
    private String especialidade;
    private String crm;
    private double salario;

    public Medico(String nome, int idade, String cpf, String especialidade, String crm, double salario) {
        super(nome, idade, cpf);
        this.especialidade = especialidade;
        this.crm = crm;
        this.salario = salario;
    }

    @Override
    public void realizarAtendimento() {
        System.out.println(getNome() + " (Médico) está atendendo um paciente 🏥");
    }
}
