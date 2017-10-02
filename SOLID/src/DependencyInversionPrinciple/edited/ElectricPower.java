package DependencyInversionPrinciple.edited;

public class ElectricPower implements ISwitch {
	public ISwitchable client;
	public boolean on;

	public ElectricPower(ISwitchable client) {
		this.client = client;
		this.on = false;
	}

	@Override
	public boolean isOn() {
		return this.on;
	}

	@Override
	public void press() {
		boolean checkOn = isOn();
		if (checkOn) {
			client.turnOff();
			this.on = false;
		} else {
		}
		client.turnOn();
		this.on = true;

	}

}
