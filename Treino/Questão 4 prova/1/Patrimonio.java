import java.math.BigDecimal;

public class Patrimonio {
    int numPatrimonio;
    String nome;
    BigDecimal valor;

    static int controlePatrimonio = 0;

    public Patrimonio(){
        this.numPatrimonio = Patrimonio.controlePatrimonio;
        controlePatrimonio++;
    }
}
