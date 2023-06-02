package exceçoes;

public class SaldoInsuficiente extends Exception {
    
    public SaldoInsuficiente(){
        System.out.println("Saldo insuficiente para saque! \n");
    }

    @Override
    public String getMessage() {
        String message = "Saldo insuficiente para saque!";
        return message;
    }
}