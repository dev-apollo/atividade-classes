public class Funcionario extends Pessoa{
    private double salario;
    private Cargo cargo;
    
    public Funcionario(String nome, double salario, Cargo cargo){
        super(nome);
        this.salario = salario;
        this.cargo = cargo;
    }

    public void mudarSalario(double salario){
        this.salario = salario;
    }

    public double getSalario(){
        return this.salario;
    }
}
