package no.hvl.dat110.messages;

public class PublishMsg extends Message {

	private String topic;
	private String message;

	// message sent from client to create publish a message on a topic

	public PublishMsg(String user, String topic, String message) {
		super(MessageType.PUBLISH, user);
		this.topic = topic;
		this.message = message;
	}

	public String getTopic() {
		return topic;
	}

	public String getMessage() {
		return message;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "PublishMsg [user=" + getUser() + ", topic=" + topic + ", message=" + message + "]";
	}
}
