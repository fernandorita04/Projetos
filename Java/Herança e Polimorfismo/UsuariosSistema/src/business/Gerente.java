package business;

import java.util.List;

public class Gerente extends Funcionario {

    public Gerente() {
        this.isAdmin = true;
    }

    public void gerarRelatorio() {
        System.out.println("Relatório financeiro gerado com sucesso!");
    }

    public void consultarVendas(List<Vendedor> vendedores) {
        int totalVendas = 0;
        for (Vendedor v : vendedores) {
            totalVendas += v.getQtVendas();
        }
        System.out.println("Total de vendas dos vendedores: " + totalVendas);
    }

}
