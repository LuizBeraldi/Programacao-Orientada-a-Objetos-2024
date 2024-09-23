class NotificacaoMaiuscula extends NotificacaoDecorator {
    public NotificacaoMaiuscula(Notificacao notificacao) {
        super(notificacao);
    }

    @Override
    public String formatarMensagem(String mensagem) {
        return super.formatarMensagem(mensagem).toUpperCase();
    }
}