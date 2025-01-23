public class Main {
    public static void main(String[] args) {
        TomadaDeDoisPinos tomada2pinos = new TomadaAdapter();
        tomada2pinos.ligarTomadaDeDoisPinos();

        TomadaAdapter tm = new TomadaAdapter();
        tm.ligarNaTomadaDeDoisPinos();
    }
}