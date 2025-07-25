package business;

public class Cultura implements Imposto {

    @Override
    public double aplicaImposto(double imposto) {
        return imposto * 0.04;
    }

}
