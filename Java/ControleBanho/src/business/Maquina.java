package business;

public class Maquina {

    private int agua = 0;
    private int shampoo = 0;
    private boolean emUso = false;
    private boolean suja = false;
    private boolean petLimpo = false;

    public int getAgua() {
        return agua;
    }
    public void setAgua(int agua) {
        this.agua = agua;
    }
    public int getShampoo() {
        return shampoo;
    }
    public void setShampoo(int shampoo) {
        this.shampoo = shampoo;
    }
    public boolean isEmUso() {
        return emUso;
    }
    public void setEmUso(boolean emUso) {
        this.emUso = emUso;
    }

    public boolean isSuja() {
        return suja;
    }

    public void setSuja(boolean suja) {
        this.suja = suja;
    }

    public boolean isPetLimpo() {
        return petLimpo;
    }

    public void setPetLimpo(boolean petLimpo) {
       this.petLimpo = petLimpo;
    }

}
