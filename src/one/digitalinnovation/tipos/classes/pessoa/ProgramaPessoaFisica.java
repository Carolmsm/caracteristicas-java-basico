package one.digitalinnovation.tipos.classes.pessoa;

public class ProgramaPessoaFisica {
    public static void main(String[] args) {

        final PessoaFisica pessoaFisica = new PessoaFisica(33, 100.5f);
        System.out.println(pessoaFisica.getIdade());
        System.out.println(pessoaFisica.getPeso());
    }
}
