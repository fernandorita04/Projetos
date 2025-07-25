package business;

public abstract class Relogio {

    protected int hora;
    protected int minuto;
    protected int segundo;

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if (hora < 0 || hora > 24) {
            throw new IllegalArgumentException("Hora deve estar entre 0 e 24.");
        }
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        if (minuto < 0 || minuto >= 60) {
            throw new IllegalArgumentException("Minuto deve estar entre 0 e 59.");
        }
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        if (segundo < 0 || segundo >= 60) {
            throw new IllegalArgumentException("Segundo deve estar entre 0 e 59.");
        }
        this.segundo = segundo;
    }

    public String getTimeFormatted() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }

    abstract Relogio converter(Relogio relogio);
}