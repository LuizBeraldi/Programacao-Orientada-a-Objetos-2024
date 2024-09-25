public class Main {
    public static void main(String[] args) {
        Pizzaria ps = new PizzariaSul();

        ps.prepararPizza(PizzariaSul.tipo_mussarela);
        ps.prepararPizza(PizzariaSul.tipo_vegetariana);
        ps.prepararPizza(PizzariaSul.tipo_calabresa);
    }
}