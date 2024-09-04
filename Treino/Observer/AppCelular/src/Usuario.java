public class Usuario implements Observer{
    private String nome;
    private int id;

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

    public Usuario(String nome, int id){
        this.nome = nome;
        this.id = id;
    }

    public void notificarUsuarios(Subject subject){
        System.out.println("O usuário "+this.nome+" de ID "+this.id+" foi notificado!");
        Twitter twitter = (Twitter)subject;
        System.out.println("Existem "+twitter.getNum()+" notificações do Twitter!\n");
    }
}
