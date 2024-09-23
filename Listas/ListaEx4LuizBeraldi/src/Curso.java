import java.util.ArrayList;
import java.util.List;

class Curso implements Subject {
    private String nome;
    private String descricao;
    private List<Observer> observers = new ArrayList<>();
    private String atualizarMensagem;

    public Curso(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
        this.atualizarMensagem = "Curso '" + nome + "' teve sua descrição atualizada para: " + descricao;
        notificarObservers();
    }

    @Override
    public void registrarObserver(Observer obs) {
        observers.add(obs);
    }

    @Override
    public void removerObserver(Observer obs) {
        observers.remove(obs);
    }

    @Override
    public void notificarObservers() {
        for (Observer obs : observers) {
            obs.atualizar(atualizarMensagem);
        }
    }
}