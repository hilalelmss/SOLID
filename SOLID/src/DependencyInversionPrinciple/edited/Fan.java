package DependencyInversionPrinciple.edited;

public class Fan implements ISwitchable {

	@Override
	public void turnOn() {
		System.out.println("fan:on");
	}

	@Override
	public void turnOff() {
		System.out.println("fan:off");
	}

}
