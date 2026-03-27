/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoprofissao;

import java.util.ArrayList;

/**
 *
 * @author joaop
 */
public class ProjetoProfissao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Profissao> profissoes = new ArrayList<>();

        profissoes.add(new Medico("Dr. João", "Saúde", 12000, "Cardiologia", 12345, "Hospital Central"));
        profissoes.add(new Professor("Maria", "Educação", 5000, "Matemática", 40, "Escola Estadual"));
        profissoes.add(new Advogado("Carlos", "Direito", 8000, "Criminal", 67890, "Silva & Associados"));
        profissoes.add(new Engenheiro("Ana", "Engenharia", 10000, "Civil", "Prédio", "Construtora XYZ"));

        for (Profissao p : profissoes) {
            System.out.println("Profissão: " + p.getNome());
            System.out.println("Área: " + p.getArea());
            System.out.println("Salário: R$ " + p.getSalario());
            p.executarTrabalho();
            System.out.println("----------------------");
        }
    }
}