public class Quarto {
    private int numero;
    private int andar;
    private Hotel hotel;
    public Quarto(int andar, int numero, Hotel hotel){
        this.andar = andar;
        this.numero = numero;
        this.hotel = hotel;
    }
    
    public int getNumero(){
        return this.numero;
    }
}