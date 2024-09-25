public abstract class Pizzaria {
    public abstract Pizza pedirPizza(int tipo);

    public void prepararPizza(int tipo) {
        Pizza pizza = this.pedirPizza(tipo);

        pizza.abrirMassa();
        pizza.adicionarMolho();
        pizza.adicionarIngredientes();
        pizza.assar();
        pizza.cortar();
    }
}
