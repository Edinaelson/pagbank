package controller;


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
        Colors.magentaColor("Taxa de Rendimento: " + taxaRendimento + "\n");
        //System.out.println("Taxa de Rendimento: " + taxaRendimento + "\n");
        return taxaRendimento;
    }


}
