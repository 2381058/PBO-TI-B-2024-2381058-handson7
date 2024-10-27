package enkapsulasi;

public class Main {
    public static void main(String[] args) {
        BankAccount govertSagala = new BankAccount(100);
        govertSagala.deposit(10);
        System.out.println(govertSagala.getSaldo());
    }
}
