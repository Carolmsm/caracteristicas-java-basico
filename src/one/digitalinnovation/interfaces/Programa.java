package one.digitalinnovation.interfaces;

public class Programa {
    public static void main(String[] args) {

        final Carro gol = new Gol();
        System.out.println("Marca do gol " +gol.marca());
        gol.ligar();

        final Veiculo trator = new Trator();
        System.out.println("Registro Trator:" +trator.registro());
        trator.ligar();

        final Carro fiesta = new Fiesta();
        System.out.println("Marco do Fiesta:" +fiesta.marca());
        fiesta.ligar();


    }
}
