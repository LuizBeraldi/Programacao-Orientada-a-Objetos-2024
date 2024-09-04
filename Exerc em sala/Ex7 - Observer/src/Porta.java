import java.util.HashSet;
import java.util.Set;

public class Porta implements Subject{
    private Boolean aberta;

    public Porta(Boolean aberta){
        this.aberta = aberta;
    }

    private Set<Observer> interessados = new HashSet<Observer>();

    public void registrarInteressado(Observer interessado){
        this.interessados.add(interessado);
    }

    public void removerInteressado(Observer interessado){
        this.interessados.remove(interessado);
    }

    public void setAberta(Boolean aberta){
        this.aberta = aberta;
        this.notificar();
    }

    public Boolean getAberta(){
        return this.aberta;
    }

    public void notificar(){
        for(Observer interessado : this.interessados){
             interessado.notificarAlteracao(this);
        }
    }
}
