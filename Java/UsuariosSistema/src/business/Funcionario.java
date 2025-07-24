package business;

import java.util.Scanner;

public class Funcionario {

    Scanner scan = new Scanner(System.in);

    protected String nome;
    protected String email;
    protected String senha;
    protected boolean isAdmin;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public void realizarLogin() {
        System.out.print("Digite o email: ");
        String emailInput = scan.nextLine();
        System.out.print("Digite a senha: ");
        String senhaInput = scan.nextLine();

        if (this.email.equals(emailInput) && this.senha.equals(senhaInput)) {
            System.out.println("Login realizado com sucesso!");
        } else {
            System.out.println("Email ou senha incorretos.");
        }
    }

    public void realizarLogoff() {
        System.out.println("Logoff realizado com sucesso!");
    }

    public void alterarDados() {
        System.out.print("Novo nome: ");
        String novoNome = scan.nextLine();
        System.out.print("Novo email: ");
        String novoEmail = scan.nextLine();

        setNome(novoNome);
        setEmail(novoEmail);

        System.out.println("Dados alterados com sucesso!");
    }

    public void alterarSenha() {
        System.out.println("Informe a senha atual: ");
        String novaSenha = scan.nextLine();
        if (this.senha.equals(novaSenha)) {
            System.out.println("Informe a senha nova: ");
            setSenha(novaSenha);
        } else {
            System.out.println("Senha incorreta. Tente novamente.");
        }
    }

}
