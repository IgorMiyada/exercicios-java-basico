package Part5.Exercise1;

public interface SendMessage {

    default void messageText(String text){
        if(this instanceof Sms){
            System.out.println("Sending message through SMS");
        }else if(this instanceof SocialNetworks){
            System.out.println("Sending message through Social Netowrks");
        }else if(this instanceof Whatsapp){
            System.out.println("Sending message through Whatsapp");
        }else if(this instanceof Email){
            System.out.println("Sending message through Email");
        }

    };
}
