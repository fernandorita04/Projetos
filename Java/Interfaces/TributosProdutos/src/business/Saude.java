package business;

public class Saude implements Imposto {

    @Override
    public double aplicaImposto(double imposto) {
        return imposto * 0.015;
    }

}
