class Aluno implements Observer {
    private String nome;
    private Notificacao notificacao;

    public Aluno(String nome) {
        this.nome = nome;
        this.notificacao = new NotificacaoSimples();
    }

    public String getNome() {
        return nome;
    }

    public void setNotificacao(Notificacao notificacao) {
        this.notificacao = notificacao;
    }

    @Override
    public void atualizar(String message) {
        System.out.println("Notificação para " + nome + ": " + notificacao.formatarMensagem(message));
    }
}