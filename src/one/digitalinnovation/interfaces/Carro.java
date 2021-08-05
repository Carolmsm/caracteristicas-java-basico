package one.digitalinnovation.interfaces;

public interface Carro extends Automovel {

    String marca();

    default void ligar() {
        System.out.println("ligar o carro!");

    }
    default String codigoRenavan(){

        return "DDS4546544";
    }
}
