package one.digitalinnovation.statics;

public class Programa {

    public static void main(String[] args) {

        Cachorro pitibul = new Cachorro();
        Cachorro viralata = new Cachorro();

       // viralata.zoologia = "Bipete";


        System.out.println(pitibul.zoologia);
        System.out.println(viralata.zoologia);

        System.out.println(viralata.late());;

        Cachorro.late();

    }
}
