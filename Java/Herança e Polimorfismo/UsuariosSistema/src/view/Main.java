package view;
import business.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setNome("Alice");
        gerente.setEmail("alice@empresa.com");
        gerente.setSenha("1234");

        Vendedor vendedor1 = new Vendedor();
        vendedor1.setNome("Bob");
        vendedor1.setEmail("bob@empresa.com");
        vendedor1.setSenha("abcd");

        Vendedor vendedor2 = new Vendedor();
        vendedor2.setNome("Carol");
        vendedor2.setEmail("carol@empresa.com");
        vendedor2.setSenha("efgh");

        Atendente atendente = new Atendente();
        atendente.setNome("Dan");
        atendente.setEmail("dan@empresa.com");
        atendente.setSenha("4321");

        System.out.println("=== Login do Gerente ===");
        gerente.realizarLogin();

        System.out.println("\n=== Vendedor 1 realiza 2 vendas ===");
        vendedor1.realizarVenda();
        vendedor1.realizarVenda();
        vendedor1.consultarVendas();

        System.out.println("\n=== Vendedor 2 realiza 1 venda ===");
        vendedor2.realizarVenda();
        vendedor2.consultarVendas();

        System.out.println("\n=== Gerente consulta vendas ===");
        List<Vendedor> vendedores = new ArrayList<>();
        vendedores.add(vendedor1);
        vendedores.add(vendedor2);
        gerente.consultarVendas(vendedores);

        System.out.println("\n=== Atendente recebe pagamento e fecha caixa ===");
        atendente.receberPagamentos();
        atendente.fecharCaixa();
    }
}
