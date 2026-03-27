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
public class Consulta {
    private Paciente paciente;
    private Pessoa profissional;
    private String data;

    public Consulta(Paciente paciente, Pessoa profissional, String data) {
        this.paciente = paciente;
        this.profissional = profissional;
        this.data = data;
    }

    public void agendarConsulta() {
        System.out.println("Consulta agendada para: " + data);
        System.out.println("Paciente: " + paciente.getNome());
        System.out.println("Profissional: " + profissional.getNome());
    }

    public void realizarConsulta() {
        System.out.println("Consulta em andamento...");
        profissional.realizarAtendimento();
        paciente.realizarAtendimento();
    }
}
