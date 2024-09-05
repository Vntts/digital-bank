package Domain;

/**
 * Interface que define as operações básicas para uma conta bancária.
 */
public interface IConta {

    /**
     * Exclui a conta com base no parâmetro fornecido.
     *
     * @param delete Se verdadeiro, a conta será excluída.
     */
    void excluirConta(boolean delete);

    /**
     * Realiza um saque na conta.
     *
     * @param valor O valor a ser sacado.
     */
    void sacar(double valor);

    /**
     * Realiza um depósito na conta.
     *
     * @param valor O valor a ser depositado.
     */
    void depositar(double valor);

    /**
     * Realiza uma transferência de valores para outra conta.
     *
     * @param valor        O valor a ser transferido.
     * @param contaDestino A conta para a qual o valor será transferido.
     */
    void transferir(double valor, IConta contaDestino);

    /**
     * Imprime o extrato da conta.
     */
    void imprimirExtrato();
}
