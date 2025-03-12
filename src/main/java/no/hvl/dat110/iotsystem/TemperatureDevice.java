package no.hvl.dat110.iotsystem;

import no.hvl.dat110.client.Client;

public class TemperatureDevice {

	private static final int COUNT = 10;

	public static void main(String[] args) {

		// simulated / virtual temperature sensor
		TemperatureSensor sn = new TemperatureSensor();

		//Create a client object
		Client client = new Client("snesor", Common.BROKERHOST, Common.BROKERPORT);

		client.connect();

		//Puublish temperature readings COUNT times
		for(int i = 0; i < COUNT; i++) {
			int temp = sn.read();
			client.publish(Common.TEMPTOPIC, String.valueOf(temp));

			//Sleep for a short duration to simulate periodic readings
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		client.disconnect();

		System.out.println("Temperature device stopping ... ");
	}
}
