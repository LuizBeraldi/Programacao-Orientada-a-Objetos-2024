public interface Subject {
    public void cadastrarUsuario(Observer interessado);

    public void removerUsuario(Observer interessado);

    public void notificar();
}
