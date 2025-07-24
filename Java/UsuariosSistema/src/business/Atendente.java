package business;

public class Atendente extends Funcionario {

    protected float valorEmCaixa;

    public float getValorEmCaixa() {
        return valorEmCaixa;
    }

    public void setValorEmCaixa(float valorEmCaixa) {
        this.valorEmCaixa = valorEmCaixa;
    }

    public Atendente() {
        this.isAdmin = false;
    }

    public void receberPagamentos() {
        System.out.print("Digite o valor a receber: ");
        float valor = scan.nextFloat();
        scan.nextLine();
        valorEmCaixa += valor;
        System.out.println("Pagamento recebido. Valor em caixa: R$ " + valorEmCaixa);
    }

    public void fecharCaixa() {
        System.out.println("Caixa fechado. Valor final em caixa: R$ " + valorEmCaixa);
        valorEmCaixa = 0;
    }

}
