package no.hvl.dat110.messages;

public class DeleteTopicMsg extends Message {

	private String user;
	private String topic;

	// message sent from client to create topic on the broker

	public DeleteTopicMsg(String user, String topic) {
		super(MessageType.DELETETOPIC, user);
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
		return "DeleteTopicMsg [user=" + user + ", topic=" + topic + "]";
	}

}
