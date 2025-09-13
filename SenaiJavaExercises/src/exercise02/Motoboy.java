package exercise02;

public class Motoboy extends Funcionario{

    private String placaDaMoto;

    public Motoboy(String nome, String cpf, String rg, Sexo sexo, double salarioBase, String dataNascimento, String dataAdmissao, String placaDaMoto) {
        super(nome, cpf, rg, sexo, salarioBase, dataNascimento, dataAdmissao);
        this.placaDaMoto = placaDaMoto;
    }

    @Override
    public String toString() {
        return "Motoboy{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", sexo=" + sexo +
                ", salarioBase=" + salarioBase +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", dataAdmissao='" + dataAdmissao + '\'' +
                ", placaDaMoto='" + placaDaMoto + '\'' +
                '}';
    }

    @Override
    public double salarioFinal() {
        return super.salarioBase;
    }
}
