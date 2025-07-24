package business;

public class Americano extends Relogio {

    private String indicadorPeriodo;

    public String getIndicadorPeriodo() {
        return indicadorPeriodo;
    }

    public void setAM() {
        this.indicadorPeriodo = "AM";
    }

    public void setPM() {
        this.indicadorPeriodo = "PM";
    }

    @Override
    public void setHora(int hora) {
        if (hora < 0 || hora > 12) {
            throw new IllegalArgumentException("Hora deve estar entre 0 e 12 para o formato AM/PM.");
        }
        this.hora = hora;
        setAM(); // Default to AM unless set to PM later
    }

    public void setHora(int hora, boolean isPM) {
        if (isPM) {
            if (hora < 1 || hora > 12) {
                throw new IllegalArgumentException("Hora deve estar entre 1 e 12 para o formato PM.");
            }
            this.hora = hora == 12 ? 12 : hora + 12; // Convert to 24-hour format
            setPM();
        } else {
            setHora(hora); // Use the existing method for AM
        }
    }

    @Override
    public Relogio converter(final Relogio relogio) {
        if (relogio instanceof Americano) {
            Americano americano = (Americano) relogio;
            this.hora = americano.getHora();
            this.minuto = americano.getMinuto();
            this.segundo = americano.getSegundo();
            this.indicadorPeriodo = americano.getIndicadorPeriodo();
        }
        return this;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d %s", hora, minuto, segundo, indicadorPeriodo);
    }
}