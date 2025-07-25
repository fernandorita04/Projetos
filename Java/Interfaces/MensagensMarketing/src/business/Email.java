package business;

public class Email implements Mensagem {

    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando E-mail: " + mensagem);
        
    }

}