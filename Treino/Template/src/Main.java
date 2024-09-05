public class Main {
    public static void main(String[] args){
        PizzariaCentral PizzariaNorte = new PizzariaNorte();
        PizzariaCentral PizzariaOeste = new PizzariaOeste();
        PizzariaCentral PizzariaSul = new PizzariaSul();

        PizzariaNorte.assarPizza("4 queijos");
        PizzariaOeste.assarPizza("Margarida");
        PizzariaSul.assarPizza("Pizza doce");
    }
}
