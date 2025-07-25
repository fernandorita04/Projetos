package business;

public class Vestuario implements Imposto {

    @Override
    public double aplicaImposto(double imposto) {
        return imposto * 0.025;
    }

}
