package one.digitalinnovation.tipos.classes.pessoa;

public class ProgramaDoCliente {

    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica(65, 70.00f);

        System.out.println(pf.getIdade());
        System.out.println(pf.getPeso());
    }
}
