import java.util.Observer;

public interface Subject {
    public void addInteressado(Observer interessado);
    public void removeInteressado(Observer interessado);
    public void notificar();
}
