package business;

public class MeiaEntrada extends Ingresso {

    public float valorReal (float valor) {
        return valor / 2;
    }

    public MeiaEntrada(float valor, String nome, String tipoAudio) {
        super(valor, nome, tipoAudio);
    }
    
}
