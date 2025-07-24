package business;

public class Brasileiro extends Relogio {

    @Override
    public Relogio converter(final Relogio relogio) {
        this.hora = relogio.getHora();
        this.minuto = relogio.getMinuto();
        this.segundo = relogio.getSegundo();
        return this;
    }

}