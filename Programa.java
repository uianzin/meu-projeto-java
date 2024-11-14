public class Programa {
    public static void main(String[] args) {
        Conta contadeian = new Conta();
        contadeian.numero = 123;
        contadeian.titular = "Isadora";
        contadeian.saldo = 10000000;
        System.out.println("O numero da conta é:" + contadeian.numero);
        System.out.println("O titular da conta é:" + contadeian.titular);
        System.out.println("O saldo da conta é:" + contadeian.saldo);
    }
}
