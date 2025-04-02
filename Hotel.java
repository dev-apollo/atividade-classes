import java.util.List;
import java.util.ArrayList;

public class Hotel {
    private String nome;
    private List<Quarto> quartos;
    public Hotel(String nome, int quantidadeQuartos){
        this.nome = nome;
        this.quartos = new ArrayList<>();
        for(int i = 1; i<quantidadeQuartos;i++){
            this.quartos.add(new Quarto(1, i, this));
        }
    }

    public Quarto getQuarto(int n){
        for(Quarto q: quartos){
            if(q.getNumero() == n){
                return q;
            }
        }
        return null;
    }

    public String getNome(){
        return this.nome;
    }
}