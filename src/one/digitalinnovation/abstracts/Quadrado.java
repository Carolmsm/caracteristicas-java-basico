package one.digitalinnovation.abstracts;

public class Quadrado extends FormaGeometrica{

    private String nome;
    private  Double area;

    public Quadrado(String nome, Double area) {
        this.setNome(nome);
        this.setArea(area);
    }


    @Override
    public String nome() {
        return getNome();
    }

    @Override
    public Double area() {
        return getArea();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }
    //@Override
    //public String toString(String nome) {
      //  final StringBuilder builder =
       // return builder.toString();
    //}
}
