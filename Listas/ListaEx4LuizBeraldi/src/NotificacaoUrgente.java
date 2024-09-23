class NotificacaoUrgente extends NotificacaoDecorator {
    public NotificacaoUrgente(Notificacao notificacao) {
        super(notificacao);
    }

    @Override
    public String formatarMensagem(String mensagem) {
        return "URGENTE " + super.formatarMensagem(mensagem);
    }
}