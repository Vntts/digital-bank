package Test;

import Domain.Cliente;
import Domain.ContaCorrente;
import Domain.ContaPoupanca;

public class Test01 {

    public static void main(String[] args) {
        // Criação do cliente
        Cliente cliente = new Cliente();
        cliente.setNome("Gabriel Ventura De Sousa ");

        // Criação das contas
        ContaCorrente contaCorrente = new ContaCorrente(cliente);
        ContaPoupanca contaPoupanca = new ContaPoupanca(cliente);

        // Operações na conta corrente
        contaCorrente.depositar(1000);
        System.out.println("Depositado 1000 na Conta Corrente.");
        contaCorrente.transferir(500, contaPoupanca);
        System.out.println("Transferido 500 da Conta Corrente para a Conta Poupança.");

        // Impressão dos extratos
        System.out.println("\n--- EXTRATO FINAL ---");
        System.out.println("Conta Corrente: " + contaCorrente.getSaldo());
        contaCorrente.imprimirExtrato();
        System.out.println("\nConta Poupança:");
        contaPoupanca.imprimirExtrato();
    }
}

