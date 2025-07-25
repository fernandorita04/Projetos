package view;

import business.*;

public class Main {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(5);
        Retangulo retangulo = new Retangulo(4, 6);
        Circulo circulo = new Circulo(8);

        System.out.printf("%.2f\n", quadrado.calcular());
        System.out.printf("%.2f\n", retangulo.calcular());
        System.out.printf("%.2f\n", circulo.calcular());

    }

}
