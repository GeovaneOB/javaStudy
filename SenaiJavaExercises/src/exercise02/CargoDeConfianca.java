package exercise02;

public abstract class CargoDeConfianca extends Funcionario{

    protected Bonificacao bonificacao;

    public CargoDeConfianca(String nome, String cpf, String rg, Sexo sexo, double salarioBase, String dataNascimento, String dataAdmissao, Bonificacao bonificacao) {
        super(nome, cpf, rg, sexo, salarioBase, dataNascimento, dataAdmissao);
        this.bonificacao = bonificacao;
    }

    @Override
    public double salarioFinal() {
        return salarioBase;
    }
}
