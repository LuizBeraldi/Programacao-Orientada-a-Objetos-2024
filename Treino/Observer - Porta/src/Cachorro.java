public class Cachorro implements Observer{
    private String nome;

    public Cachorro(String nome){
        this.nome = nome;
    }

    public void update(Subject subject){
        System.out.println("O cahorro "+this.nome+" latiu para a porta!");
        Porta porta = (Porta)subject;
        System.out.println("A porta foi mexida!");
    }
}
