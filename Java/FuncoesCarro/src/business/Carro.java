package business;

public class Carro {

    private int velocidade = 0;
    private int marcha = 0;
    private boolean ligado = false;
    private boolean pontoMorto = true;

    public int getVelocidade() {
        return velocidade;
    }
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    public int getMarcha() {
        return marcha;
    }
    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }
    public boolean isPontoMorto() {
        return pontoMorto;
    }
    public void setPontoMorto(boolean pontoMorto) {
        this.pontoMorto = pontoMorto;
    }
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getLigado() {
        return ligado;
    }
}
