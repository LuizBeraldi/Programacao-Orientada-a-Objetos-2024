public class Main {
    public static void main(String[] args) {
        Porta porta = new Porta(false);

        Observer m1 = new Morador("José");
        Observer m2 = new Morador("Luiz");
        Observer c1 = new Cachorro("Snoopy");

        porta.registrarInteressado(m1);
        porta.registrarInteressado(m2);
        porta.registrarInteressado(c1);

        porta.setAberta(true);
        porta.removerInteressado(m2);
        porta.setAberta(false);
    }
}