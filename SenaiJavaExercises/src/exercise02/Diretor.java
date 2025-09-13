package exercise02;

public class Diretor extends CargoDeConfianca implements Contratacao {

    private double premio = 1.1;

    public Diretor(String nome, String cpf, String rg, Sexo sexo, double salarioBase, String dataNascimento, String dataAdmissao, Bonificacao bonificacao) {
        super(nome, cpf, rg, sexo, salarioBase, dataNascimento, dataAdmissao, Bonificacao.DIRETOR);
    }

    public double getSalarioBonificacao() {

        return (Bonificacao.DIRETOR.getValor() * salarioBase);

    }

    public double getPremio() {
        return (premio * salarioBase) + getSalarioBonificacao();
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Admitindo funcionário: " + funcionario.nome);
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Demitindo funcionário: " + funcionario.nome);
    }

    @Override
    public String toString() {
        return "Diretor{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", sexo=" + sexo +
                ", salarioBase=" + salarioBase +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", dataAdmissao='" + dataAdmissao + '\'' +
                ", Premio=" + premio +
                ", bonificacao=" + bonificacao +
                ", salarioPremio + Bonificacao=" + Math.round(this.getPremio()) +
                '}';
    }
}
