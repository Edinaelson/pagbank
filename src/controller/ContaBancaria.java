package controller;
import exceptions.SaldoInsuficiente;
import interfaces.MovimentacaoBancaria;

public class ContaBancaria implements MovimentacaoBancaria{
    private String numeroConta;
    private double saldo;

    public ContaBancaria(String numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public ContaBancaria() {

    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumeroConta(){
        return numeroConta;
    }

    public double getSaldo(){
        return saldo;
    }

    @Override
    public void depositar(double valor) {
        this.saldo+= valor;
        Colors.greenColor("Deposito realizado com sucesso!");
        Colors.blueColor("Valor em saldo: " + this.saldo);
    }

    @Override
    public void sacar(double valor) throws Exception {
        
        if(saldo < valor){
            throw new SaldoInsuficiente();
        }
        else{
            this.saldo -= valor;
            Colors.greenColor("Saque realizado com sucesso!");
            Colors.blueColor("Valor em saldo: " + this.saldo);
        }
    }
    
}
