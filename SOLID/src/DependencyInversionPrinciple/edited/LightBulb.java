package DependencyInversionPrinciple.edited;

public class LightBulb implements ISwitchable {

	@Override
	public void turnOn() {
		System.out.println("lightbulb:on");
	}

	@Override
	public void turnOff() {
		System.out.println("lightbulb:off");
	}

}
