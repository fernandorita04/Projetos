package business;

public class IngressoFamilia extends Ingresso {

    int numeroPessoas;

    @Override
    public float valorReal(float valor) {
        float total = valor * numeroPessoas;
        if (numeroPessoas > 3) {
            total = total * 0.95f;
        }
        return total;
    }

    public IngressoFamilia(float valor, String nome, String tipoAudio, int numeroPessoas) {
        super(valor, nome, tipoAudio);
        this.numeroPessoas = numeroPessoas;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Filme: " + nome);
        System.out.println("Áudio: " + tipoAudio);
        System.out.println("Número de pessoas: " + numeroPessoas);
        System.out.printf("Valor total: R$ %.2f", valorReal(super.valor));
    }

}
