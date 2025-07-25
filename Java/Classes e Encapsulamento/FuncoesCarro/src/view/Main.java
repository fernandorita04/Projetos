package view;

import java.util.Scanner;
import business.Carro;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Carro carro = new Carro();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Ligar o carro");
            System.out.println("2. Desligar o carro");
            System.out.println("3. Acelerar");
            System.out.println("4. Diminuir a velocidade");
            System.out.println("5. Virar para a esquerda");
            System.out.println("6. Virar para a direita");
            System.out.println("7. Trocar a marcha");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    carro.setLigado(true);
                    System.out.printf("Velocidade: %d km/h", carro.getVelocidade());
                    System.out.printf("\nMarcha: %d\n", carro.getMarcha());
                    break;
                case 2:
                    if (carro.isPontoMorto() == true && carro.getVelocidade() == 0)
                        carro.setLigado(false);
                    else
                        System.out.println("O carro não está em ponto morto.");
                    System.out.printf("Velocidade: %d km/h", carro.getVelocidade());
                    System.out.printf("\nMarcha: %d\n", carro.getMarcha());
                    break;
                case 3:
                    if (carro.getLigado() == true && carro.getVelocidade() < 120) {
                        carro.setVelocidade(carro.getVelocidade() + 1);
                    } else if (carro.getLigado() == false) {
                        System.out.println("O carro precisa estar ligado para acelerar.");
                    } else if (carro.getVelocidade() >= 120) {
                        System.out.println("Velocidade máxima atingida.");
                    }
                    System.out.printf("Velocidade: %d km/h", carro.getVelocidade());
                    System.out.printf("\nMarcha: %d\n", carro.getMarcha());
                    break;
                case 4:
                    if (carro.getLigado() == true && carro.getVelocidade() > 0) {
                        carro.setVelocidade(carro.getVelocidade() - 1);
                    } else if (carro.getLigado() == false) {
                        System.out.println("O carro precisa estar ligado para desacelerar.");
                    } else if (carro.getVelocidade() == 0) {
                        System.out.println("Velocidade mínima atingida.");
                    }
                    System.out.printf("Velocidade: %d km/h", carro.getVelocidade());
                    System.out.printf("\nMarcha: %d\n", carro.getMarcha());
                    break;
                case 5:
                    if (carro.getLigado() == true && carro.getVelocidade() > 0 && carro.getVelocidade() <= 40) {
                        System.out.println("Virando para a esquerda.");
                    } else if (carro.getLigado() == false) {
                        System.out.println("O carro precisa estar ligado para virar.");
                    } else if (carro.getVelocidade() == 0) {
                        System.out.println("O carro precisa de mais velocidade para virar.");
                    } else if (carro.getVelocidade() > 40) {
                        System.out.println("O carro está muito rápido para virar.");
                    }
                    System.out.printf("Velocidade: %d km/h", carro.getVelocidade());
                    System.out.printf("\nMarcha: %d\n", carro.getMarcha());
                    break;
                case 6:
                    if (carro.getLigado() == true && carro.getVelocidade() > 0 && carro.getVelocidade() <= 40) {
                        System.out.println("Virando para a direita.");
                    } else if (carro.getLigado() == false) {
                        System.out.println("O carro precisa estar ligado para virar.");
                    } else if (carro.getVelocidade() == 0) {
                        System.out.println("O carro precisa de mais velocidade para virar.");
                    } else if (carro.getVelocidade() > 40) {
                        System.out.println("O carro está muito rápido para virar.");
                    }
                    System.out.printf("Velocidade: %d km/h", carro.getVelocidade());
                    System.out.printf("\nMarcha: %d\n", carro.getMarcha());
                    break;
                case 7:
                    System.out.println("Digite o número da marcha desejada: ");
                    int novaMarcha = scan.nextInt();
                    if (novaMarcha == 0) {
                        if (carro.getVelocidade() != 0) {
                            System.out.println("O carro precisa estar com 0 km/h para estar em ponto morto.");
                        } else {
                            carro.setMarcha(novaMarcha);
                        }
                    System.out.printf("Velocidade: %d km/h", carro.getVelocidade());
                    System.out.printf("\nMarcha: %d\n", carro.getMarcha());
                    }
                    if (novaMarcha == 1) {
                        if (carro.getVelocidade() > 20) {
                            System.out.println(
                                    "A velocidade do carro precisa estar entre 0 km/h e 20 km/h para mudar para a marcha 1.");
                        } else {
                            carro.setMarcha(novaMarcha);
                        }
                    System.out.printf("Velocidade: %d km/h", carro.getVelocidade());
                    System.out.printf("\nMarcha: %d\n", carro.getMarcha());
                    }
                    if (novaMarcha == 2) {
                        if (carro.getVelocidade() < 21 || carro.getVelocidade() > 40) {
                            System.out.println(
                                    "A velocidade do carro precisa estar entre 21 km/h e 40 km/h para mudar para a marcha 2.");
                        } else {
                            carro.setMarcha(novaMarcha);
                        }
                    System.out.printf("Velocidade: %d km/h", carro.getVelocidade());
                    System.out.printf("\nMarcha: %d\n", carro.getMarcha());
                    }
                    if (novaMarcha == 3) {
                        if (carro.getVelocidade() < 41 || carro.getVelocidade() > 60) {
                            System.out.println(
                                    "A velocidade do carro precisa estar entre 41 km/h e 60 km/h para mudar para a marcha 3.");
                        } else {
                            carro.setMarcha(novaMarcha);
                        }
                    System.out.printf("Velocidade: %d km/h", carro.getVelocidade());
                    System.out.printf("\nMarcha: %d\n", carro.getMarcha());
                    }
                    if (novaMarcha == 4) {
                        if (carro.getVelocidade() < 61 || carro.getVelocidade() > 80) {
                            System.out.println(
                                    "A velocidade do carro precisa estar entre 61 km/h e 80 km/h para mudar para a marcha 4.");
                        } else {
                            carro.setMarcha(novaMarcha);
                        }
                    System.out.printf("Velocidade: %d km/h", carro.getVelocidade());
                    System.out.printf("\nMarcha: %d\n", carro.getMarcha());
                    }
                    if (novaMarcha == 5) {
                        if (carro.getVelocidade() < 81 || carro.getVelocidade() > 100) {
                            System.out.println(
                                    "A velocidade do carro precisa estar entre 81 km/h e 100 km/h para mudar para a marcha 5.");
                        } else {
                            carro.setMarcha(novaMarcha);
                        }
                    System.out.printf("Velocidade: %d km/h", carro.getVelocidade());
                    System.out.printf("\nMarcha: %d\n", carro.getMarcha());
                    }
                    if (novaMarcha == 6) {
                        if (carro.getVelocidade() < 101 || carro.getVelocidade() > 120) {
                            System.out.println(
                                    "A velocidade do carro precisa estar entre 101 km/h e 120 km/h para mudar para a marcha 6.");
                        } else {
                            carro.setMarcha(novaMarcha);
                        }
                    System.out.printf("Velocidade: %d km/h", carro.getVelocidade());
                    System.out.printf("\nMarcha: %d\n", carro.getMarcha());
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    scan.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
