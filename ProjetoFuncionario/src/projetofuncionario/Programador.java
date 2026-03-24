package projetofuncionario;

public class Programador extends Funcionario {

    private String linguagem;
    private int anosExperiencia;
    private boolean trabalhaRemoto;

    public Programador(String nome, double salario, String setor, String linguagem, int anosExperiencia, boolean trabalhaRemoto) {
        super(nome, salario, setor);
        this.linguagem = linguagem;
        this.anosExperiencia = anosExperiencia;
        this.trabalhaRemoto = trabalhaRemoto;
    }

    @Override
    public void trabalhar() {
        System.out.println("O programador está codando");
    }
}