package DependencyInversionPrinciple.ordinary;

public class ElectricPower {
	public LightBulb bulb;
	public boolean on;

	public ElectricPower(LightBulb bulb) {
		this.bulb = bulb;
		this.on = false;

	}

	public boolean isOn() {
		return this.on;
	}

	public void press() {
		boolean checkOn = isOn();
		if (checkOn) {
			bulb.turnOff();
			this.on = false;

		} else {
			bulb.turnOn();
			this.on = true;
		}
	}
}
