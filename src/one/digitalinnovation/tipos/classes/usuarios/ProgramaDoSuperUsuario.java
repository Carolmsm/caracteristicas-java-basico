package one.digitalinnovation.tipos.classes.usuarios;

public class ProgramaDoSuperUsuario {
    public static void main(String[] args) {
        final SuperUsuario su = new SuperUsuario("root", "2545484488");

        su.getLogin();
        su.getSenha();

        String root = su.getSenha();
    }
}
