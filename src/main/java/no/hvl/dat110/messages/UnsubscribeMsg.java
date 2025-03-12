package no.hvl.dat110.messages;

public class UnsubscribeMsg extends Message {
    
    private String topic; // Object variable for the topic

    // Constructor
    public UnsubscribeMsg(String user, String topic) {
        super(MessageType.UNSUBSCRIBE, user);
        this.topic = topic;
    }

    // Getter for topic
    public String getTopic() {
        return topic;
    }

    // Setter for topic
    public void setTopic(String topic) {
        this.topic = topic;
    }

    // toString method
    @Override
    public String toString() {
        return "UnsubscribeMsg [user=" + getUser() + ", topic=" + topic + "]";
    }
}