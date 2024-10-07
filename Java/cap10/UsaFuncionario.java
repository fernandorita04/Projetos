package cap10;

import javax.swing.JOptionPane;

public class UsaFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        PessoaJuridica pessoaJuridica = new PessoaJuridica();
    
        String u, v, t, z;
        int x;
    
        z = JOptionPane.showInputDialog("Digite 1 se contribuinte é pessoa física \nDigite 2 se é pessoa jurídica");
        x = Integer.parseInt(z);
    
        if (z.length() == 1) {
            switch (x) {
                case 1:
                    u = JOptionPane.showInputDialog("Escrever o nome do contribuinte: ");
                    v = JOptionPane.showInputDialog("Escrever o RG do contribuinte: ");
                    t = JOptionPane.showInputDialog("Escrever a identificação do cartão do contribuinte: ");
    
                    funcionario.setNome(u);
                    funcionario.setRg(v);
                    funcionario.setCartao(t);
                    System.out.println("NOME: " + funcionario.getNome());
                    System.out.println("RG: " + funcionario.getRg());
                    System.out.println("CARTÃO: " + funcionario.getCartao());
                    break;
    
                case 2:
                    u = JOptionPane.showInputDialog("Escrever o nome do contribuinte: ");
                    v = JOptionPane.showInputDialog("Escrever o CNPJ do contribuinte: ");
                    t = JOptionPane.showInputDialog("Escrever a identificação do cartão do contribuinte: ");
    
                    pessoaJuridica.setNome(u);
                    pessoaJuridica.setCnpj(v);
                    funcionario.setCartao(t);
                    System.out.println("NOME: " + pessoaJuridica.getNome());
                    System.out.println("CNPJ: " + pessoaJuridica.getCnpj());
                    System.out.println("CARTÃO: " + funcionario.getCartao());
                    break;
            }
        }
    }
}
