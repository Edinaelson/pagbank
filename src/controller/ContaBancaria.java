package controller;
import exceçoes.SaldoInsuficiente;
import interfaces.MovimentacaoBancaria;

public class ContaBancaria implements MovimentacaoBancaria{
    private String numeroConta;
    private double saldo;

    public ContaBancaria(String numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
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
        System.out.println("Deposito realizado com sucesso!\n" + "Valor em saldo " + this.saldo);
    }

    @Override
    public void sacar(double valor) throws Exception {
        if(saldo < valor){
            throw new SaldoInsuficiente(saldo);
        }
        else
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso!\n" + "Valor em saldo " + this.saldo);
    }
    
}
