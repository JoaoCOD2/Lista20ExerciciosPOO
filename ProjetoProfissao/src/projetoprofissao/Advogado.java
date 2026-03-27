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
public class Advogado extends Profissao {
    private String tipoCaso;
    private int oab;
    private String escritorio;

    public Advogado(String nome, String area, double salario, String tipoCaso, int oab, String escritorio) {
        super(nome, area, salario);
        this.tipoCaso = tipoCaso;
        this.oab = oab;
        this.escritorio = escritorio;
    }

    @Override
    public void executarTrabalho() {
        System.out.println(getNome() + " está defendendo um cliente ⚖️");
    }

    public String getTipoCaso() {
        return tipoCaso;
    }

    public void setTipoCaso(String tipoCaso) {
        this.tipoCaso = tipoCaso;
    }
}
