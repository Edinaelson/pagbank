import controller.ContaBancaria;

public class ContaPoupanca extends ContaBancaria {
    private double taxaRendimento;
    

    public ContaPoupanca(String numeroConta, double saldo, double taxaRendimento){
        super(numeroConta, saldo);
        this.taxaRendimento = taxaRendimento;
    }

    public double getTaxaderendimento(){
        return taxaRendimento;
    }
    
    public void setTaxaRedimento(double taxaderendimento){
        this.taxaRendimento = taxaderendimento;
    }

    public double calcularRendimento(){
        return getSaldo() * taxaRendimento;
    }


}
