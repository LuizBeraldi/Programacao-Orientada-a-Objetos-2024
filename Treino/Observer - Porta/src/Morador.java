public class Morador implements Observer {
    private String nome;

    public Morador(String nome) {
        this.nome = nome;
    }

    public void update(Subject subject) {
        System.out.println("O morador "+this.nome+" foi notificado!");
        Porta porta = (Porta)subject;
        System.out.println("A porta foi mexida!");
    }
}