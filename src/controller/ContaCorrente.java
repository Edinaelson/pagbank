package controller;

import exceptions.SaldoInsuficiente;

public class ContaCorrente extends ContaBancaria{
    private double limiteChequeEspecial;

    public ContaCorrente(String numeroConta, double saldo, double limiteChequeEspecial){
        super(numeroConta, saldo);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public void sacar(double valor) throws Exception {
        if(valor > getSaldo() && valor <= limiteChequeEspecial){
            this.limiteChequeEspecial -= valor;
            Colors.cyanColor("Limite Especial: " + limiteChequeEspecial);
            //System.out.printf("Limite Especial: " + limiteChequeEspecial+"\n");
        } else if(valor <= getSaldo()){
            super.sacar(valor);
        } else {
            throw new SaldoInsuficiente();
        }
    }
}
