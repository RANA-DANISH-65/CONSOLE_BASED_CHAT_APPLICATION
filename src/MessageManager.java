import java.util.ArrayList;

public class MessageManager {
    private ArrayList<Message> messagesList;


    public MessageManager() {
        this.messagesList = new ArrayList<>();
    }

    public ArrayList<Message> getMessagesList() {
        return messagesList;
    }

    public void addMessage(Message message) {
        messagesList.add(message);
    }


    public int getMessagesCount() {
        return messagesList.size();
    }


    public void clearAllMessages() {
        messagesList.clear();
        System.out.println("\t\t--------------| Cleared all messages");
    }


    public void searchMessagesBySender(String senderID) {

        for (Message message : messagesList) {
            if (message.getSenderID().equals(senderID)) {
                System.out.println(message);
            }
        }

    }
    public void deleteMessagesByContact(String contactID) {
        messagesList.removeIf(message ->
                message.getSenderID().equals(contactID) || message.getReceiverID().equals(contactID));
        System.out.println("Messages Deleted Successfully");
    }


    public boolean markMessageAsRead(int messageIndex) {
        if (messageIndex >= 0 && messageIndex < messagesList.size()) {
            messagesList.get(messageIndex).setMessageStatus(Status.READ);
            return true;
        }
        return false;
    }
    public void displayAllMessages(){
        if(messagesList.size()==0
        ){
            System.out.println("No Messages to display");
        }else {
            System.out.println("\t\t================>Showing All Messages <=================");
            for (Message message : messagesList) {
                System.out.println(message);
                message.setMessageStatus(Status.READ);
            }
        }
    }

    public void markMessagesAsRead(){
        for (Message message : messagesList) {
            message.setMessageStatus(Status.READ);
        }
        System.out.println("\t\t--------------|All Messages are marked Read");
    }
    public void displayMessagesForContact(String contactID) {
        System.out.println("Displaying Messages for Contact "+contactID);
        for (Message message : messagesList) {
            if (message.getSenderID().equals(contactID) || message.getReceiverID().equals(contactID)) {
                System.out.println(message);
            }
        }
    }
}
