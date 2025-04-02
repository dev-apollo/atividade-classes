import java.util.ArrayList;
import java.util.List;

public class Reserva {
    private String dataEntrada;
    private String dataSaida;
    private List<Hospede> hospedes;
    private boolean ativa;
    private Veiculo veiculo;
    private Quarto quarto;

    public Reserva(String dataEntrada, String dataSaida, List<Hospede> hospedes, Quarto quarto){
        if(hospedes == null || hospedes.isEmpty()){
            throw new IllegalArgumentException("É obrigatório ao menos um hospede para a criação da reserva.");
        }
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.hospedes = new ArrayList<>(hospedes);
        this.ativa = true;
        this.veiculo = null;
        this.quarto = quarto;
        for(Hospede h: hospedes){
            h.addReserva(this);
        }
    }

    public void checkIn(Hospede hospede){
        if((!hospedes.contains(hospede)) && ativa){
            hospedes.add(hospede);
            hospede.addReserva(this);
        }
    }

    public void checkOut(Hospede hospede){
        if(!ativa) return;
        if(hospedes.contains(hospede)){
            hospedes.remove(hospede);
            hospede.removeReserva(this);
        }
        if(hospedes.isEmpty()){
            cancelarReserva();
        }
    }

    public void cancelarReserva(){
        this.ativa = false;
        for(Hospede h: new ArrayList<>(hospedes)){
            h.removeReserva(this);
        }
        hospedes.clear();
    }

    public void addVeiculo(Veiculo veiculo){
        if(this.veiculo == null){
            this.veiculo = veiculo;
        }else{
            System.out.println("A reserva já possui um veículo.");
        }
    }
}