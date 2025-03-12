package no.hvl.dat110.iotsystem;

import no.hvl.dat110.client.Client;
import no.hvl.dat110.common.TODO;
import no.hvl.dat110.messages.Message;
import no.hvl.dat110.messages.PublishMsg;

public class DisplayDevice {
	
	private static final int COUNT = 10;
		
	public static void main (String[] args) {
		
		System.out.println("Display starting ...");
		
		//Create a client object
		Client client = new Client("display", Common.BROKERHOST, Common.BROKERPORT);

		client.connect();

		//Create the topic if it doesn´t exist
		client.createTopic(Common.TEMPTOPIC);

		//Subscribe to the temperature topic
		client.subscribe(Common.TEMPTOPIC);

		//Receive COUNT messages
		for(int i = 0; i < COUNT; i++) {
			Message msg = client.receive();
			if(msg instanceof PublishMsg) {
				System.out.println("Received: " + ((PublishMsg) msg).getMessage());
			}
		}

		//Unsubscribe from the topic
		client.unsubscribe(Common.TEMPTOPIC);

		client.disconnect();
		
		System.out.println("Display stopping ... ");
		
		throw new UnsupportedOperationException(TODO.method());
		
	}
}
