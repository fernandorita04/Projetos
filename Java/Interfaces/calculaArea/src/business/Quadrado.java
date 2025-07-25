package business;

public class Quadrado implements CalculaArea {

    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcular() {
        return lado * lado;
    }

}
