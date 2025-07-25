package view;

import java.util.Scanner;
import business.Maquina;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Maquina maquina = new Maquina();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Colocar pet na máquina");
            System.out.println("2. Dar banho no pet");
            System.out.println("3. Retirar pet da máquina");
            System.out.println("4. Verificar se tem pet no banho");
            System.out.println("5. Abastecer com água");
            System.out.println("6. Abastecer com shampoo");
            System.out.println("7. Verificar nível de água");
            System.out.println("8. Verificar nível de shampoo");
            System.out.println("9. Limpar máquina");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    if (maquina.isSuja()) {
                        System.out.println("A máquina está suja. Realize a limpeza antes de colocar outro pet.");
                    } else if (!maquina.isEmUso()) {
                        System.out.println("Colocando pet na máquina.");
                        maquina.setEmUso(true);
                        maquina.setPetLimpo(false);
                    } else {
                        System.out.println("A máquina está em uso no momento.");
                    }
                    break;
                case 2:
                    if (maquina.isEmUso() && maquina.getAgua() >= 10 && maquina.getShampoo() >= 2) {
                        System.out.println("Dando banho no pet.");
                        maquina.setAgua(maquina.getAgua() - 10);
                        maquina.setShampoo(maquina.getShampoo() - 2);
                        maquina.setSuja(false);
                        maquina.setPetLimpo(true);
                    } else if (!maquina.isEmUso()) {
                        System.out.println("Não há nenhum pet na máquina no momento.");
                    } else if (maquina.getAgua() < 10) {
                        System.out.println("Não há água suficiente na máquina para dar o banho.");
                    } else if (maquina.getShampoo() < 2) {
                        System.out.println("Não há shampoo suficiente na máquina para dar o banho.");
                    }
                    break;
                case 3:
                    if (maquina.isEmUso()) {
                        System.out.println("Retirando pet da máquina.");
                        if (!maquina.isPetLimpo()) {
                            maquina.setSuja(true);
                        }
                        maquina.setEmUso(false);
                        maquina.setPetLimpo(false);
                    } else {
                        System.out.println("Não há nenhum pet na máquina no momento.");
                    }
                    break;
                case 4:
                    if (maquina.isEmUso() == true) {
                        System.out.println("Há um pet no banho no momento.");
                    } else {
                        System.out.println("Não há nenhum pet no banho no momento.");
                    }
                    break;
                case 5:
                    if (maquina.getAgua() >= 29)
                        System.out.println("A capacidade máxima de água da máquina é de 30 litros.");
                    else
                        maquina.setAgua(maquina.getAgua() + 2);
                    break;
                case 6:
                    if (maquina.getShampoo() >= 9)
                        System.out.println("A capacidade máxima de shampoo da máquina é de 10 litros.");
                    else
                        maquina.setShampoo(maquina.getShampoo() + 2);
                    break;
                case 7:
                    System.out.printf("O nível de água no momento é de: %d litros", maquina.getAgua());
                    break;
                case 8:
                    System.out.printf("O nível de shampoo no momento é de: %d litros", maquina.getShampoo());
                    break;
                case 9:
                    if (!maquina.isEmUso() && maquina.getAgua() >= 3 && maquina.getShampoo() >= 1) {
                        System.out.println("Realizando a limpeza da máquina.");
                        maquina.setAgua(maquina.getAgua() - 3);
                        maquina.setShampoo(maquina.getShampoo() - 1);
                        maquina.setSuja(false);
                    } else if (maquina.isEmUso()) {
                        System.out.println("Não é possível limpar a máquina enquanto ela está em uso.");
                    } else if (maquina.getAgua() < 3) {
                        System.out.println("A máquina não possui água suficiente para realizar a limpeza.");
                    } else if (maquina.getShampoo() < 1) {
                        System.out.println("A máquina não possui shampoo suficiente para realizar a limpeza.");
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    scan.close();
                    return;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
}
