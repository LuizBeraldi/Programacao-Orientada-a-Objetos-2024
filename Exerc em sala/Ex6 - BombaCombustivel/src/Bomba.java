import java.util.ArrayList;

public class Bomba {
    private String id;
    private ArrayList<Combustivel> combustiveis;

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public ArrayList<Combustivel> getCombustiveis(){
        return combustiveis;
    }

    public void setCombustiveis(ArrayList<Combustivel> combustiveis){
        this.combustiveis = combustiveis;
    }
}
