import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Cargo c1 = new Cargo("Assistente de TI");
        System.out.println(c1.getNome());

        Funcionario f1 = new Funcionario("Gabriel Alexandre", 3000.00, c1);
        System.out.println(f1.getSalario());
        f1.mudarSalario(4500.00);
        System.out.println(f1.getSalario());

        //Quartos são criados dentro do build do Hotel.
        Hotel hl1 = new Hotel("Hotel 5 estrelas", 4);
        System.out.println(hl1.getNome());
        System.out.println(hl1.getQuarto(1));

        Hospede hp1 = new Hospede("Jhony Luiz", "Itajaí", "CPF");
        Hospede hp2 = new Hospede("Thiago Felski", "Navegantes", "CPF");
        List<Hospede> hospedes = new ArrayList<>();
        hospedes.add(hp1);
        hospedes.add(hp2);
        for(Hospede h: hospedes){
            System.out.println(h.getNome());
        }

        Reserva r1 = new Reserva("02/04/2025", "07/04/2025", hospedes, hl1.getQuarto(1));
        List<Hospede> hospedesReservados = r1.getHospedes();
        for(Hospede h: hospedesReservados){
            System.out.println(h.getNome());
        }

        r1.checkOut(hp2);
        hospedesReservados = r1.getHospedes();
        for(Hospede h: hospedesReservados){
            System.out.println(h.getNome());
        }

        r1.checkIn(hp2);
        hospedesReservados = r1.getHospedes();
        for(Hospede h: hospedesReservados){
            System.out.println(h.getNome());
        }

        //Veiculo é automaticamente adicionado na reserva.
        Veiculo v1 = new Veiculo("Carro", "Placa", r1);

        r1.cancelarReserva();
        r1.checkIn(hp1);
    }
}
