package Part5.Exercise1;

import Part5.Exercise3.GeometricForm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Choose the way desired to send the message : ");

            System.out.println("""
                    1 - Email
                    2 - Sms 
                    3 - Social Networks
                    4 - WhatsApp
                    """);
            int option = scanner.nextInt();
            scanner.nextLine();
            if(option>4) {
                throw new IllegalArgumentException();
            }
            System.out.println("Write your message : ");
            String message = scanner.nextLine();
            SendMessage sendMessage ;
            switch(option){
                case 1 :
                    sendMessage = new Email();
                    sendMessage.messageText(message);
                    break;
                case 2 :
                    sendMessage = new Sms();
                    sendMessage.messageText(message);
                    break;
                case 3 :
                    sendMessage = new SocialNetworks();
                    sendMessage.messageText(message);
                    break;
                case 4 :
                    sendMessage = new Whatsapp();
                    sendMessage.messageText(message);
                    break;
            }
        }catch(IllegalArgumentException error){
            System.out.println("Option not available");
        }

    }
}

