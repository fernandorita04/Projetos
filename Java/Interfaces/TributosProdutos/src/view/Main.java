package view;

import business.*;

public class Main {
    public static void main(String[] args) {
        Alimentacao alimentacao = new Alimentacao();
        Saude saude = new Saude();
        Vestuario vestuario = new Vestuario();
        Cultura cultura = new Cultura();

        System.out.println(alimentacao.aplicaImposto(1500));
        System.out.println(saude.aplicaImposto(2000));
        System.out.println(vestuario.aplicaImposto(3000));
        System.out.println(cultura.aplicaImposto(4500));
    }

}
