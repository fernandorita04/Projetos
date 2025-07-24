package view;
import business.*;

public class Main {
    public static void main(String[] args) {
        Ingresso ingresso = new Ingresso(30, "Oppenheimer", "legendado");
        MeiaEntrada meiaEntrada = new MeiaEntrada(30, "Divertida Mente 2", "dublado");
        IngressoFamilia ingressoFamilia = new IngressoFamilia(30, "Batman", "dublado", 4);

        ingresso.exibirDetalhes();
        System.out.println("\n");
        meiaEntrada.exibirDetalhes();
        System.out.println("\n");
        ingressoFamilia.exibirDetalhes();
    }

}
