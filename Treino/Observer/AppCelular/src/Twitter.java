import java.util.HashSet;
import java.util.Set;

public class Twitter implements Subject{
    private Boolean notificacao;
    static int num = 0;

    public Twitter(Boolean notificacao){
        this.notificacao = notificacao;
    }

    private Set<Observer> interessados = new HashSet<Observer>();

    public void cadastrarUsuario(Observer interessado){
        this.interessados.add(interessado);
    }

    public void removerUsuario(Observer interessado){
        this.interessados.remove(interessado);
    }

    public void existeNotificacao(Boolean notificacao){
        this.notificacao = notificacao;
        Twitter.num += 1;
        this.notificar();
    }

    public Boolean getNotificacao(){
        return this.notificacao;
    }

    public int getNum(){
        return Twitter.num;
    }

    public void notificar(){
        for(Observer interessado : this.interessados){
            interessado.notificarUsuarios(this);
        }
        System.out.println("###################################################\n");
    }
}
