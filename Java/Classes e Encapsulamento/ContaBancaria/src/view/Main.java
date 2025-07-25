package view;
import java.util.Scanner;
import business.Conta;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o valor para abrir a conta: R$ ");
        double saldoInicial = scan.nextDouble();
        Conta conta = new Conta(saldoInicial);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Consultar cheque especial");
            System.out.println("3 - Depositar dinheiro");
            System.out.println("4 - Sacar dinheiro");
            System.out.println("5 - Pagar um boleto");
            System.out.println("6 - Verificar se está usando cheque especial");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    System.out.printf("Saldo atual: R$ %.2f\n", conta.getSaldo());
                    break;
                case 2:
                    System.out.printf("Limite do cheque especial: R$ %.2f\n", conta.getChequeEspecial());
                    break;
                case 3:
                    System.out.print("Valor para depositar: R$ ");
                    double deposito = scan.nextDouble();
                    conta.depositar(deposito);
                    System.out.println("Depósito realizado.");
                    break;
                case 4:
                    System.out.print("Valor para sacar: R$ ");
                    double saque = scan.nextDouble();
                    if (conta.sacar(saque)) {
                        System.out.println("Saque realizado.");
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;
                case 5:
                    System.out.print("Valor do boleto: R$ ");
                    double boleto = scan.nextDouble();
                    if (conta.sacar(boleto)) {
                        System.out.println("Boleto pago.");
                    } else {
                        System.out.println("Saldo insuficiente para pagar o boleto.");
                    }
                    break;
                case 6:
                    if (conta.isUsandoChequeEspecial()) {
                        System.out.println("A conta está usando cheque especial.");
                    } else {
                        System.out.println("A conta NÃO está usando cheque especial.");
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    scan.close();
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}