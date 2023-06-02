import controller.ContaCorrente;

public class Main {
    public static void main(String[] args) throws Exception {
        ContaCorrente c1 = new ContaCorrente("2020",10,50);
        c1.sacar(30);
    }
}