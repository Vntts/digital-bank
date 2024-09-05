package Domain;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void excluirConta(boolean delete) {
        if (delete) {
            System.out.println("Conta excluída com sucesso.");
        } else {
            System.out.println("A exclusão da conta foi cancelada.");
        }
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("--- EXTRATO DA CONTA CORRENTE ---");
        super.imprimirInfosComuns();
        System.out.println(String.format("Saldo atual: %.2f", this.getSaldo()));
    }
}
