import java.util.List;
import java.util.ArrayList;

public class Hotel {
    private String nome;
    private List<Quarto> quartos;
    public Hotel(String nome, List<Quarto> quartos){
        this.nome = nome;
        this.quartos = new ArrayList<>(quartos);
    }
}