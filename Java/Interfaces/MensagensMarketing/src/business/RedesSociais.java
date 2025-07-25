package business;

public class RedesSociais implements Mensagem {

    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando mensagem nas Redes Sociais: " + mensagem);
        
    }

}