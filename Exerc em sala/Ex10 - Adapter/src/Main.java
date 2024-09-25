public class Main {
    public static void main(String[] args) throws InterruptedException {
        ControleDePonto controleDePonto = new ControleDePonto();
        Funcionario funcionario = new Funcionario("Luiz");
        controleDePonto.registrarEntrada(funcionario);
        Thread.sleep(3000);
        controleDePonto.registrarSaida(funcionario);

        ControleAdapter controleAdapter = new ControleAdapter();
        controleAdapter.registrarEntrada(funcionario);
        Thread.sleep(3000);
        controleAdapter.registrarSaida(funcionario);
    }

}
