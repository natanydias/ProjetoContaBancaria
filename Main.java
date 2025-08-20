public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("12345-6", "Natany Dias", 1000.0);
        ContaBancaria conta2 = new ContaBancaria("98765-4", "Valentim Dias", 500.0);

        conta1.depositar(250.0);
        conta1.sacar(100.0);
        conta1.consultarSaldo();

        System.out.println();

        conta2.depositar(300.0);
        conta2.sacar(800.0);
        conta2.consultarSaldo();
    }
}
