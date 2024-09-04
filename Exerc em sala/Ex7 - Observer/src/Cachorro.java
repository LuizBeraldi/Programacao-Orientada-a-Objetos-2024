public class Cachorro implements Observer{
    private String nome;

    public Cachorro(String nome){
        this.nome = nome;
    }

    public void notificarAlteracao(Subject subject){
        System.out.println("O doguinho "+this.nome+" latiu!");
        Porta porta = (Porta)subject;
        System.out.println("A porta foi mexida!");
    }
}
