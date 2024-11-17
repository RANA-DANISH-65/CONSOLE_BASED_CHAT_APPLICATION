import java.time.LocalDateTime;

public class Message {
    private String senderID;
    private String receiverID;
    private String message;
    private LocalDateTime time;
    private Status messageStatus;


    public Message(String senderID, String receiverID, String message) {
        this.senderID = senderID;
        this.receiverID = receiverID;
        this.message = message;
        this.time = LocalDateTime.now();
        this.messageStatus = Status.UNREAD;
    }


    public String getSenderID() {
        return senderID;
    }

    public void setSenderID(String senderID) {
        this.senderID = senderID;
    }

    public String getReceiverID() {
        return receiverID;
    }

    public void setReceiverID(String receiverID) {
        this.receiverID = receiverID;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Status getMessageStatus() {
        return messageStatus;
    }

    public void setMessageStatus(Status messageStatus) {
        this.messageStatus = messageStatus;
    }


    @Override
    public String toString() {
        return String.format("Sender ID: %s | Receiver ID: %s | Message: %s | Time: %s | Message Status: %s",
                senderID, receiverID, message, time, messageStatus);
    }
}
