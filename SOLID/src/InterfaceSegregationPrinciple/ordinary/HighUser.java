package InterfaceSegregationPrinciple.ordinary;

public class HighUser implements IUser {

	@Override
	public void update() {
		System.out.println("+");
	}

	@Override
	public void create() {
		System.out.println("+");
	}

	@Override
	public void delete() {
		System.out.println("+");
	}

}
