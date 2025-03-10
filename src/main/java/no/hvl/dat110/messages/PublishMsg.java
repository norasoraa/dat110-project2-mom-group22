package no.hvl.dat110.messages;

import no.hvl.dat110.common.TODO;

public class PublishMsg extends Message {

	private String user;
	private String topic;
	private String message;

	// message sent from client to create publish a message on a topic

	public PublishMsg(String user, String topic, String message) {
		super(MessageType.PUBLISH, user);
		this.user = user;
		this.topic = topic;
		this.message = message;
	}

	public String getUser() {
		return user;
	}

	public String getTopic() {
		return topic;
	}

	public String getMessage() {
		return message;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "PublishMsg [user=" + user + ", topic=" + topic + ", message=" + message + "]";
	}
}
