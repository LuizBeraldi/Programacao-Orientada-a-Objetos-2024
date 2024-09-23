public class SucoDecoratorLeite extends SucoDecorator{
    public SucoDecoratorLeite(Suco suco){
        super(suco);
    }

    public String getNome(){
        String nomeInteiro = this.getSuco().getNome()+" com leite";
        return nomeInteiro;
    }

    @Override
    public double getPreco() {
        double precoTotal = this.getSuco().getPreco()+1;
        return precoTotal;
    }
}
