import java.util.ArrayList;
import java.util.List;

public class Hospede extends Pessoa{
    private String endereco;
    private String documento;
    private List<Reserva> reservas;

    public Hospede(String nome, String endereco, String documento){
        super(nome);
        this.endereco = endereco;
        this.documento = documento;
        this.reservas = new ArrayList<>();
    }
    
    public void addReserva(Reserva reserva){
        if(!reservas.contains(reserva)){
            reservas.add(reserva);
        }
    }

    public void removeReserva(Reserva reserva){
        if(reservas.contains(reserva)){
            reservas.remove(reserva);
        }
    }
}