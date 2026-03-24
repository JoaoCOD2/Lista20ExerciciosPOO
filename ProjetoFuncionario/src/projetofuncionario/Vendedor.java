package projetofuncionario;

public class Vendedor extends Funcionario {

    private double metaVendas;
    private int vendasMes;
    private boolean comissao;

    public Vendedor(String nome, double salario, String setor, double metaVendas, int vendasMes, boolean comissao) {
        super(nome, salario, setor);
        this.metaVendas = metaVendas;
        this.vendasMes = vendasMes;
        this.comissao = comissao;
    }

    @Override
    public void trabalhar() {
        System.out.println("O vendedor está vendendo produtos");
    }
}