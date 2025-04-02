public class Veiculo {
    private Reserva reserva;
    private String placa;
    private String modelo;

    public Veiculo(String modelo, String placa, Reserva reserva){
        this.modelo = modelo;
        this.placa = placa;
        this.reserva = reserva;
        this.reserva.addVeiculo(this);
    }
}