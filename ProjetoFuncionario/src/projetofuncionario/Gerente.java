package projetofuncionario;

public class Gerente extends Funcionario {

    private int equipe;
    private String departamento;
    private boolean acessoFinanceiro;

    public Gerente(String nome, double salario, String setor, int equipe, String departamento, boolean acessoFinanceiro) {
        super(nome, salario, setor);
        this.equipe = equipe;
        this.departamento = departamento;
        this.acessoFinanceiro = acessoFinanceiro;
    }

    @Override
    public void trabalhar() {
        System.out.println("O gerente está gerenciando a equipe");
    }
}