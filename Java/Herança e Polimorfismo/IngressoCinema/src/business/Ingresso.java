package business;

public class Ingresso {

    protected float valor;
    protected String nome;
    protected String tipoAudio;

    public Ingresso(float valor, String nome, String tipoAudio) {
        this.valor = valor;
        this.nome = nome;
        this.tipoAudio = tipoAudio;
    }

    public float valorReal (float valor) {
        return valor;
    }

    public void exibirDetalhes() {
        System.out.println("Filme: " + nome);
        System.out.println("Áudio: " + tipoAudio);
        System.out.printf("Valor: R$ %.2f", valorReal(valor));
    }

}
