package business;

public class Alimentacao implements Imposto {

    @Override
    public double aplicaImposto(double imposto) {
        return imposto * 0.01;
    }

}
