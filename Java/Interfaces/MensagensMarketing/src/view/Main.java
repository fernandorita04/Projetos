package view;
import business.*;

public class Main {
    public static void main(String[] args) {
        SMS sms = new SMS();
        Email email = new Email();
        RedesSociais redes = new RedesSociais();
        WhatsApp whatsapp = new WhatsApp();

        sms.enviarMensagem("Mensagem de marketing por SMS!");
        email.enviarMensagem("Mensagem de marketing por E-mail!");
        redes.enviarMensagem("Mensagem de marketing nas Redes Sociais!");
        whatsapp.enviarMensagem("Mensagem de marketing no WhatsApp!");
    }
}
