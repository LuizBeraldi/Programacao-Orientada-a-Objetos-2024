abstract class NotificacaoDecorator implements Notificacao {
    protected Notificacao notificacao;

    public NotificacaoDecorator(Notificacao notificacao) {
        this.notificacao = notificacao;
    }

    @Override
    public String formatarMensagem(String mensagem) {
        return notificacao.formatarMensagem(mensagem);
    }
}