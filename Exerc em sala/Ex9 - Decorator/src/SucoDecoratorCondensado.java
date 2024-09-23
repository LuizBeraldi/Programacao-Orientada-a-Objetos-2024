public class SucoDecoratorCondensado extends SucoDecorator{
    public SucoDecoratorCondensado(Suco suco){
        super(suco);
    }

    public String getNome(){
        String nomeInteiro = this.getSuco().getNome()+" com leite condensado";
        return nomeInteiro;
    }

    @Override
    public double getPreco() {
        double precoTotal = this.getSuco().getPreco()+2;
        return precoTotal;
    }
}
