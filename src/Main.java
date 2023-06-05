import controller.Colors;
import controller.ContaCorrente;
import controller.ContaPoupanca;
import exceptions.SaldoInsuficiente;

public class Main {
    public static void main(String[] args) throws Exception {
        try {

            ContaCorrente c1 = new ContaCorrente("2020",10,50);
            ContaPoupanca c2 = new ContaPoupanca("2023", 1000, 40);
            c1.sacar(30);
            c1.depositar(500);
            c1.sacar(200);
            c1.sacar(700);
            c2.depositar(300);
            c2.sacar(100);
            c2.calcularRendimento();
            c2.sacar(1500);

        }catch (SaldoInsuficiente e){
            Colors.redColor(e.getMessage());
            //System.out.println("Mensagem Error: " + e.getMessage());
        }
    }
}