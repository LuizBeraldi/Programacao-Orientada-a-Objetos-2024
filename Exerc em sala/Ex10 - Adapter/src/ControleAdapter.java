public class ControleAdapter extends ControleDePonto{
    private ControleDePontoNovo novo;

    public ControleAdapter() {
        novo = new ControleDePontoNovo();
    }

    public void registrarEntrada(Funcionario funcionario) {
        this.novo.registrar(funcionario, true);
    }

    @Override
    public void registrarSaida(Funcionario funcionario) {
        this.novo.registrar(funcionario,false);
    }
}
