public abstract class Pizza {
    public void abrirMassa(){
        System.out.println("Abrindo a massa");
    }

    public abstract void adicionarMolho();

    public abstract void adicionarIngredientes();

    public abstract void assar();

    public abstract void cortar();
}
