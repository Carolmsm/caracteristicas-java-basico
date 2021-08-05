package one.digitalinnovation.interfaces;

public class Fiesta implements Carro, Veiculo{
    @Override
    public String marca() {
        return "Fiat";

    }

    @Override
    public String registro() {
        return "HGGHJ44555";
    }

    @Override
    public void ligar() {
        Carro.super.ligar();

        Veiculo.super.ligar();
    }

    }


