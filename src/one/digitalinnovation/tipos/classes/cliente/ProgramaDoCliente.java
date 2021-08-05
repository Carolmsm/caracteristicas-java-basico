package one.digitalinnovation.tipos.classes.cliente;

public class ProgramaDoCliente {

    public static void main(String[] args) {
        Cliente cliente = new Cliente(18, 115.20f);

        System.out.println(cliente.getIdade());

        System.out.println(cliente.getPeso());

    }
}
