package Domain;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void excluirConta(boolean delete) {
        if (delete) {
            System.out.println("Conta Poupança excluída com sucesso.");
        } else {
            System.out.println("Exclusão da Conta Poupança foi cancelada.");
        }
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("--- EXTRATO DA CONTA POUPANÇA ---");
        super.imprimirInfosComuns();
        System.out.println(String.format("Saldo atual: %.2f", this.getSaldo()));
    }
}
