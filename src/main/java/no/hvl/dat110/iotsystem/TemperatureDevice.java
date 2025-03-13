package no.hvl.dat110.iotsystem;

import no.hvl.dat110.client.Client;

public class TemperatureDevice {

	private static final int COUNT = 10;

	public static void main(String[] args) {

		// simulated / virtual temperature sensor
		TemperatureSensor sn = new TemperatureSensor();

		Client client = new Client("sensor", Common.BROKERHOST, Common.BROKERPORT);

		client.connect();

		for (int i = 0; i < COUNT; i++) {
			client.publish(Common.TEMPTOPIC, Integer.toString(sn.read()));
		}

		client.disconnect();

		System.out.println("Temperature device stopping ... ");

	}
}
