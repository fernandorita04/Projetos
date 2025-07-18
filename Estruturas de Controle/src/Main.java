import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("Menu de Opções:");
            System.out.println("1. Tabuada de 1 a 10");
            System.out.println("2. Calcular IMC");
            System.out.println("3. Infomar pares ou ímpares entre um intervalo");
            System.out.println("4. Dividir até encontrar resto diferente de 0");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer
            switch (opcao) {
                case 1:
                    int num, resultado;
                    System.out.println("Informe um número: ");
                    num = scanner.nextInt();
                    for (int i = 1; i <= 10; i++) {
                        resultado = num * i;
                        System.out.printf("%d x %d = %d\n", num, i, resultado);
                    }
                case 2:
                    float altura, peso, imc;
                    System.out.println("Informe sua altura: ");
                    altura = scanner.nextFloat();
                    System.out.println("Informe seu peso: ");
                    peso = scanner.nextFloat();
                    imc = peso / (altura * altura);
                    System.out.printf("Seu IMC é: %.2f\n", imc);
                    if (imc <= 18.5) {
                        System.out.println("Abaixo do peso");
                    } else if (imc > 18.5 && imc <= 24.9) {
                        System.out.println("Peso ideal");
                    } else if (imc > 24.9 && imc <= 29.9) {
                        System.out.println("Levemente acima do peso");
                    } else if (imc > 29.9 && imc <= 34.9) {
                        System.out.println("Obesidade Grau I");
                    } else if (imc > 34.9 && imc <= 39.9) {
                        System.out.println("Obesidade Grau II (Severa)");
                    } else {
                        System.out.println("Obesidade III (Mórbida)");
                    }
                case 3:
                    int num1, num2, opcao2;
                    System.out.println("Informe um número: ");
                    num1 = scanner.nextInt();
                    do {
                        System.out.println("Informe um número maior: ");
                        num2 = scanner.nextInt();
                        if (num2 < num1) {
                            System.out.println("O número informado é menor. Tente novamente.");
                        }
                    } while (num2 < num1);
                    do {
                        System.out.println("Informe uma opção.\n1 - Pares\n2 - Ímpares\nEscolha uma opção: ");
                        opcao2 = scanner.nextInt();
                        if (opcao2 != 1 && opcao2 != 2) {
                            System.out.println("Opção inválida. Tente novamente.");
                        }
                    } while (opcao2 != 1 && opcao2 != 2);
                    switch (opcao2) {
                        case 1:
                            for (int i = num1; i <= num2; i++) {
                                if (i % 2 == 0) {
                                    System.out.printf("%d é par\n", i);
                                }
                            }
                        case 2: 
                            for (int i = num1; i <= num2; i++) {
                                if (i % 2 != 0) {
                                    System.out.printf("%d é ímpar\n", i);
                                }
                            }
                    }
                    case 4:
                        int numInicial, n;
                        System.out.println("Informe um número: ");
                        numInicial = scanner.nextInt();
                        do {
                            System.out.println("Informe outro número: ");
                            n = scanner.nextInt();
                            if (numInicial % n == 0) {
                                System.out.printf("Resto da divisão de %d por %d é 0.\n", numInicial, n);
                            } else {
                                System.out.printf("Resto da divisão de %d por %d é diferente de 0.\nEncerrando o programa.\n", numInicial, n);
                            }
                        } while (numInicial % n == 0);
            }
        } while (opcao != 5);
    }
}