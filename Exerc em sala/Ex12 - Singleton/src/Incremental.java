public class Incremental {
    private int numero = 0;
    private static Incremental instance;

    private Incremental(){}

    public static Incremental getInstance(){
        if (Incremental.instance == null){
            Incremental.instance = new Incremental();
        }
        return Incremental.instance;
    }

    public void incrementar() {
        numero++;
    }

    @Override
    public String toString() {
        return "Incremental " + this.numero;
    }
}