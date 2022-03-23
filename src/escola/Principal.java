package escola;

public class Principal {
    public static void main(String[] args) {
        Aluno p1 = new Aluno();

        p1.setNome("Claudio");
        p1.setMatricula(1111);
        p1.setCurso("Informática");
        p1.setIdade(15);
        p1.setSexo("M");
        p1.pagarMensalidade();

        Bolsista b1 = new Bolsista();

        b1.setNome("Victor");
        b1.setMatricula(2222);
        b1.setCurso("Como não miar");
        b1.setIdade(9);
        b1.setSexo("M");
        b1.setBolsa(50.0f);
        b1.pagarMensalidade();
    }
}
