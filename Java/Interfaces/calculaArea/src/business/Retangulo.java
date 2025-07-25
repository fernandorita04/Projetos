package business;

public class Retangulo implements CalculaArea {

    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcular() {
        return base * altura;
    }
}
