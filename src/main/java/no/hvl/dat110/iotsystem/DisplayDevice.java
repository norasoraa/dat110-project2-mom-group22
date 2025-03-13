package no.hvl.dat110.iotsystem;

import no.hvl.dat110.client.Client;
import no.hvl.dat110.messages.Message;
import no.hvl.dat110.messages.PublishMsg;

public class DisplayDevice {

	private static final int COUNT = 10;

	public static void main(String[] args) {

		System.out.println("Display starting ...");

		Client client = new Client("display", Common.BROKERHOST, Common.BROKERPORT);

		client.connect();

		client.createTopic(Common.TEMPTOPIC);
		client.subscribe(Common.TEMPTOPIC);

		for (int i = 0; i < COUNT; i++) {
			Message msg = client.receive();
			if (msg instanceof PublishMsg) {
				System.out.println("Display received message: " + ((PublishMsg) msg).getMessage());
			}
		}

		client.unsubscribe(Common.TEMPTOPIC);
		client.disconnect();

		System.out.println("Display stopping ... ");

	}
}
