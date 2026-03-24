package projetofuncionario;

public class Funcionario {

    private String nome;
    private double salario;
    private String setor;

    public Funcionario(String nome, double salario, String setor) {
        this.nome = nome;
        this.salario = salario;
        this.setor = setor;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public String getSetor() {
        return setor;
    }

    public void trabalhar() {
        System.out.println("O funcionário está trabalhando");
    }
}