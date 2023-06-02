package controller;

public class ContaCorrente extends ContaBancaria{
    private double limiteChequeEspecial;

    ContaCorrente(){

    }

    @override
    sacar(double x){
        if(x < saldo && x <= limiteChequeEspecial){

        }
    }



}
