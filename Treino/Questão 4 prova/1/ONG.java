import java.util.LinkedList;

public class ONG {
    private String nome, cnpj;
    LinkedList<NotaFiscal> notasFiscais;

    private LinkedList avioes;

    public void setAvioes(LinkedList avioes){
        this.avioes = avioes;
    }

    public LinkedList getAvioes(){
        return avioes;
    }
}
