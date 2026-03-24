package projetofuncionario;

public class ProjetoFuncionario {

    public static void main(String[] args) {

        Funcionario[] funcionarios = {
            new Gerente("Alberto", 11000, "Administração", 10, "Financeiro", true),
            new Vendedor("Yuri", 9000, "Vendas", 50000, 30, true),
            new Programador("João", 34000, "TI", "Java", 5, true),
            new Designer("Marcos", 15000, "Marketing", "Figma", "UI", true)
        };

        for (Funcionario f : funcionarios) {
            f.trabalhar();
        }
    }
}