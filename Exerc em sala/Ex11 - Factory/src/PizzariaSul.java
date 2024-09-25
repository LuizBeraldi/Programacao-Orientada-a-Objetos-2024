public class PizzariaSul extends Pizzaria{
    public static final int tipo_mussarela = 1;
    public static final int tipo_vegetariana = 2;
    public static final int tipo_calabresa = 3;

    public Pizza pedirPizza(int tipo){
        if(tipo == tipo_mussarela){
            return new PizzaMussarela();
        }else if(tipo == tipo_vegetariana){
            return new PizzaVegetariana();
        }else if (tipo == tipo_calabresa){
            return new PizzaCalabresa();
        }else{
            return null;
        }
    }
}
