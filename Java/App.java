import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("Menu de Opções:");
            System.out.println("1. Perguntar nome e idade");
            System.out.println("2. Calcular a área de um quadrado");
            System.out.println("3. Calcular a área de um retângulo");
            System.out.println("4. Diferença de idade entre duas pessoas");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer
            switch (opcao) {
                case 1:
                    String nome;
                    int idade;
                    System.out.println("Qual é o seu nome?");
                    nome = scanner.nextLine();
                    System.out.println("Qual é a sua idade?");
                    idade = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer
                    System.out.println("Olá " + nome + ", você tem " + idade + " anos.");
                    break;
                case 2:
                    int lado, area;
                    System.out.println("Digite o tamanho do lado do quadrado:");
                    lado = scanner.nextInt();
                    area = lado * lado;
                    System.out.println("A área do quadrado é: " + area);
                    break;
                case 3:
                    int base, altura, areaRetangulo;
                    System.out.println("Digite a base do retângulo:");
                    base = scanner.nextInt();
                    System.out.println("Digite a altura do retângulo:");
                    altura = scanner.nextInt();
                    areaRetangulo = base * altura;
                    System.out.println("A área do retângulo é: " + areaRetangulo);
                    break;
                case 4:
                    int idade1, idade2, diferenca;
                    System.out.println("Digite a idade da primeira pessoa:");
                    idade1 = scanner.nextInt();
                    System.out.println("Digite a idade da segunda pessoa:");
                    idade2 = scanner.nextInt();
                    diferenca = Math.abs(idade1 - idade2);
                    System.out.println("A diferença de idade entre as duas pessoas é: " + diferenca
                            + " anos.");
                    break;
                case 5:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 5);
        scanner.close();
    }
}
