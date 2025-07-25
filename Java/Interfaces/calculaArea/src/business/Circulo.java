package business;

public class Circulo implements CalculaArea {

    private static final double piRadiano = Math.PI;
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcular() {
        return piRadiano * (raio * raio);
    }

}
