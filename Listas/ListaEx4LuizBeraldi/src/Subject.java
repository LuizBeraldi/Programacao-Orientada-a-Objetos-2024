interface Subject {
    void registrarObserver(Observer obs);
    void removerObserver(Observer obs);
    void notificarObservers();
}