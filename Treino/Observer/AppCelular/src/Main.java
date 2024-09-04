public class Main {
    public static void main(String[] args){
        Twitter twitter = new Twitter(false);

        Usuario u1 = new Usuario("Luiz", 1);
        Usuario u2 = new Usuario("José", 2);
        Usuario u3 = new Usuario("Leonice", 3);

        twitter.cadastrarUsuario(u1);
        twitter.cadastrarUsuario(u2);
        twitter.cadastrarUsuario(u3);

        twitter.existeNotificacao(true);
        twitter.removerUsuario(u3);
        twitter.existeNotificacao(true);
        twitter.existeNotificacao(true);
    }
}
