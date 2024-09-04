public interface Subject {
    public void registrarInteressado(Observer interessado);
    public void removerInteressado(Observer interessado);
    public void notificar();
}
