package one.digitalinnovation.finals;

public class Programa {
    public static void main(String[] args) {
        final HardCoreGamer hardcoreGame = new HardCoreGamer();

        final Gamer gmaer = new Gamer();

        final CasualGamer casualGamer = new CasualGamer();

       final String game = "PUBG";

        //game = "WoW";
        System.out.println(casualGamer.play(game));
    }
}
