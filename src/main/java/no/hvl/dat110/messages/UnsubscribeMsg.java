package no.hvl.dat110.messages;

public class UnsubscribeMsg extends Message {

	private String user;
	private String topic;

	// message sent from client to unsubscribe on a topic

	public UnsubscribeMsg(String user, String topic) {
		super(MessageType.UNSUBSCRIBE, user);
		this.user = user;
		this.topic = user;
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
		return "UnsubscribeMsg [user=" + user + ", topic=" + topic + "]";
	}

}
