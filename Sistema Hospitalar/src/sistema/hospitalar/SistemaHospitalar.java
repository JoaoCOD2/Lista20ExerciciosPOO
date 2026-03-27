/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.hospitalar;

import java.util.ArrayList;

/**
 *
 * @author joaop
 */
public class SistemaHospitalar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Paciente paciente = new Paciente("João", 25, "123.456.789-00", "Dor de cabeça", "Nenhum", "Unimed");

        Medico medico = new Medico("Dr. Carlos", 45, "111.222.333-44", "Clínico Geral", "12345", 15000);
        Enfermeiro enfermeiro = new Enfermeiro("Ana", 30, "555.666.777-88", "Emergência", "67890", 5000);

        ArrayList<Pessoa> profissionais = new ArrayList<>();
        profissionais.add(medico);
        profissionais.add(enfermeiro);

        for (Pessoa p : profissionais) {
            p.realizarAtendimento(); // polimorfismo aqui
        }

        Consulta consulta = new Consulta(paciente, medico, "30/03/2026");

        consulta.agendarConsulta();
        consulta.realizarConsulta();
    }
}
