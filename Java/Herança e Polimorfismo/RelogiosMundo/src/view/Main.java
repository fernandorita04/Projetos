package view;
import business.*;

public class Main {
    public static void main(String[] args) {
        Americano americanoClock = new Americano();
        americanoClock.setHora(10);
        americanoClock.setMinuto(30);
        americanoClock.setSegundo(45);
        System.out.println("Americano Clock: " + americanoClock.getTimeFormatted());

        Brasileiro brasileiroClock = new Brasileiro();
        brasileiroClock.setHora(15);
        brasileiroClock.setMinuto(45);
        brasileiroClock.setSegundo(30);
        System.out.println("Brasileiro Clock: " + brasileiroClock.getTimeFormatted());

        // Demonstrate conversion (if implemented)
        // Relogio convertedClock = americanoClock.converter(brasileiroClock);
        // System.out.println("Converted Clock: " + convertedClock.exibirHora());
    }
}