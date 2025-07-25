package business;

public class WhatsApp implements Mensagem {

    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando mensagem no WhatsApp: " + mensagem);
        
    }

}