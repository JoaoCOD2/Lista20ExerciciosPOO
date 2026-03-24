package projetofuncionario;

public class Designer extends Funcionario {

    private String ferramenta;
    private String especialidade;
    private boolean trabalhaComUX;

    public Designer(String nome, double salario, String setor, String ferramenta, String especialidade, boolean trabalhaComUX) {
        super(nome, salario, setor);
        this.ferramenta = ferramenta;
        this.especialidade = especialidade;
        this.trabalhaComUX = trabalhaComUX;
    }

    @Override
    public void trabalhar() {
        System.out.println("O designer está criando layouts");
    }
}