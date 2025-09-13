package exercise02;

public class Gerente extends CargoDeConfianca {

    public Gerente(String nome, String cpf, String rg, Sexo sexo, double salarioBase, String dataNascimento, String dataAdmissao) {
        super(nome, cpf, rg, sexo, salarioBase, dataNascimento, dataAdmissao, Bonificacao.GERENTE);
    }

    public double getSalarioBonificado () {

        return (salarioBase * Bonificacao.GERENTE.getValor()) + salarioBase;

    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", sexo=" + sexo +
                ", salarioBase=" + salarioBase +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", dataAdmissao='" + dataAdmissao + '\'' +
                ", bonificacao=" + bonificacao +
                ", salarioBonificado=" + getSalarioBonificado() +
                '}';
    }
}
