import java.util.Date;

class NotificacaoComData extends NotificacaoDecorator {
    public NotificacaoComData(Notificacao notificacao) {
        super(notificacao);
    }

    @Override
    public String formatarMensagem(String mensagem) {
        return super.formatarMensagem(mensagem) + " (Data de atualização: " + new Date() + ")";
    }
}