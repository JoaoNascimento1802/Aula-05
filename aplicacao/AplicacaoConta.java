package aplicacao;

import entidade.ContaCorrente;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entidade.ContaPoupanca;
import entidade.Conta;

public class AplicacaoConta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nCriação de CONTA");
        System.out.println("Deseja criar uma conta:");
        System.out.println("1 - Corrente");
        System.out.println("2 - Poupança");
        int escolha = sc.nextInt();

        if (escolha == 1) {
            criarContaCorrente(sc);
        } else if (escolha == 2) {
            criarContaPoupanca(sc);
        } else {
            System.out.println("Opção inválida. Encerrando...");
        }

        sc.close();
    }

    private static void criarContaCorrente(Scanner sc) {
        System.out.println("\n=== Criando Conta Corrente ===");

        System.out.print("Nome da conta: ");
        String nome = sc.next();

        System.out.print("Número da conta: ");
        int numero = sc.nextInt();

        System.out.print("Saldo inicial: ");
        double saldo = sc.nextDouble();

        System.out.print("Limite de crédito: ");
        double limite = sc.nextDouble();

        ContaCorrente contaCorrente = new ContaCorrente(nome, numero, saldo, limite);

        System.out.print("Deseja depositar? (Valor): ");
        double deposito = sc.nextDouble();
        contaCorrente.depositar(deposito);

        System.out.print("Deseja sacar? (Valor): ");
        double saque = sc.nextDouble();
        contaCorrente.sacar(saque);

        System.out.println("\nDetalhes da Conta Corrente:");
        System.out.println(contaCorrente);
    }

    private static void criarContaPoupanca(Scanner sc) {
        System.out.println("\n=== Criando Conta Poupança ===");

        System.out.print("Nome da conta: ");
        String nome = sc.next();

        System.out.print("Número da conta: ");
        int numero = sc.nextInt();

        System.out.print("Saldo inicial: ");
        double saldo = sc.nextDouble();

        System.out.print("Valor para poupança: ");
        double poupanca = sc.nextDouble();

        ContaPoupanca contaPoupanca = new ContaPoupanca(nome, numero, saldo, poupanca);

        System.out.print("Deseja depositar na poupança? (Valor): ");
        double deposito = sc.nextDouble();
        contaPoupanca.depositarNaPoupanca(deposito);

        System.out.print("Deseja sacar da poupança? (Valor): ");
        double saque = sc.nextDouble();
        contaPoupanca.sacarDaPoupanca(saque);

        System.out.println("\nDetalhes da Conta Poupança:");
        System.out.println(contaPoupanca);
    }
}

