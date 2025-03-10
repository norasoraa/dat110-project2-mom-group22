package no.hvl.dat110.messages;

public class CreateTopicMsg extends Message {

	private String user;
	private String topic;

	// message sent from client to create topic on the broker

	public CreateTopicMsg(String user, String topic) {
		super(MessageType.CREATETOPIC, user);
		this.user = user;
		this.topic = topic;
	}

	public String getUser() {
		return user;
	}

	public String getTopic() {
		return topic;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	@Override
	public String toString() {
		return "CreateTopicMsg [user=" + user + ", topic=" + topic + "]";
	}

}
