package controller;

import exceçoes.SaldoInsuficiente;

public class ContaCorrente extends ContaBancaria{
    private double limiteChequeEspecial;

    public ContaCorrente(String numeroConta, double saldo, double limiteChequeEspecial){
        super();
        setSaldo(saldo);
        setNumeroConta(numeroConta);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public void sacar(double valor) throws Exception {
        if(valor > getSaldo() && valor <= limiteChequeEspecial){
            this.limiteChequeEspecial -= valor;
            System.out.printf("Limite E: " + limiteChequeEspecial);
        } else if(valor >= getSaldo()){
            super.sacar(valor);
        } else {
            throw new SaldoInsuficiente(valor);
        }
    }
}
