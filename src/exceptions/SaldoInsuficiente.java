package exceptions;

import controller.Colors;

public class SaldoInsuficiente extends Exception {
    
    public SaldoInsuficiente(){
        Colors.redColor("Saldo insuficiente para saque! \n");
    }

    @Override
    public String getMessage() {
        String message = "Saldo insuficiente para saque!";
        return message;
    }
}