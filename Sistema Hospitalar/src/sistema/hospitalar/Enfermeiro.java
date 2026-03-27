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
public class Enfermeiro extends Pessoa {
    private String setor;
    private String coren;
    private double salario;

    public Enfermeiro(String nome, int idade, String cpf, String setor, String coren, double salario) {
        super(nome, idade, cpf);
        this.setor = setor;
        this.coren = coren;
        this.salario = salario;
    }

    Enfermeiro(String ana, int i, String string, String emergência, String string0, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void realizarAtendimento() {
        System.out.println(getNome() + " (Enfermeiro) está auxiliando no atendimento 💉");
    }
}
