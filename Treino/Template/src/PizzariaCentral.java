public abstract class PizzariaCentral {
    private String nomePizza;

    public abstract void prepararPizza(String nomePizza);

    public void assarPizza(String nomePizza){
        this.prepararPizza(nomePizza);
        System.out.println("Assando a pizza\nPizza pronta para retirar!\n");
    }

    public String getNomePizza(){
        return this.nomePizza;
    }

}
