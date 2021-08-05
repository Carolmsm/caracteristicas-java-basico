package one.digitalinnovation.enums;

public enum   Status {

    OPEN(13,"Aberto"),
    CLOSE(02, "Fechado");

    private int cod;
    private String texto;

    Status(final int cod, final String texto) {

        this.setCod(cod);
        this.setTexto(texto);
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
