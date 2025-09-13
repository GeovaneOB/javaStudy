package exercise02;

public enum Sexo {

    FEMININO ("Feminino"),
    MASCULINO ("Masculino");

    private final String NomeSexo;

    Sexo(String nomeSexo) {
        NomeSexo = nomeSexo;
    }

    public String getNomeSexo() {
        return NomeSexo;
    }

    @Override
    public String toString() {
        return String.valueOf(NomeSexo);
    }
}
