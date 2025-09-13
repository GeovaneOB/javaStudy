package exercise02;

public class Main {
    public static void main(String[] args) {

        Motoboy motoboy = new Motoboy ("Anil", "080.876.564-98", "15.234.543-98",
                Sexo.MASCULINO, 1800.0, "27/05/2000", "10/01/2025", "ABNT2");

        Gerente gerente = new Gerente ("Aldo", "123.456.789-98", "12.345.678-98",
                Sexo.MASCULINO, 3000.0, "25/06/1980", "10/05/2020");

        Diretor diretor = new Diretor ("Calvina", "321.987.456-89", "32.565.098-54",
                Sexo.FEMININO, 7000.0, "25/06/1975", "10/05/2000", Bonificacao.DIRETOR);

        System.out.printf("\n=== RESULTADOS ===\n\n");

        System.out.println("DADOS:");
        System.out.println(motoboy.toString());
        System.out.println(gerente.toString());
        System.out.println(diretor.toString());

        System.out.println();
        System.out.println("RELATÓRIOS RH: ");

        diretor.admitir(gerente);
        diretor.admitir(motoboy);
    }
}