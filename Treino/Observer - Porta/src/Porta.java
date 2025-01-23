import java.util.HashSet;
import java.util.Observable;
import java.util.Observer;
import java.util.Set;

public class Porta implements Subject{
    private Boolean aberta;

    public Porta(Boolean aberta){
        this.aberta = aberta;
    }

    private Set<Observer> interessados = new HashSet<Observer>();

    @Override
    public void addInteressado(Observer interessado) {
        this.interessados.add(interessado);
    }

    public void removeInteressado(Observer interessado) {
        this.interessados.remove(interessado);
    }

    public void setAberta(Boolean aberta) {
        this.aberta = aberta;
        this.notificar();
    }

    public Boolean getAberta() {
        return this.aberta;
    }

    public void notificar() {
        for(Observer interessado : this.interessados){
            interessado.update(this);
        }
    }
}
