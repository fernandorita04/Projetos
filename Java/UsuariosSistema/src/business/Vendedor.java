package business;

public class Vendedor extends Funcionario {

    public Vendedor() {
        this.isAdmin = false;
    }

    protected int qtVendas = 0;

    public int getQtVendas() {
        return qtVendas;
    }

    public void setQtVendas(int qtVendas) {
        this.qtVendas = qtVendas;
    }

    public void realizarVenda() {
        qtVendas++;
    }

    public void consultarVendas() {
        System.out.println("Quantidade de vendas realizadas: " + qtVendas);
    }

}
