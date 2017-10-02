package InterfaceSegregationPrinciple.ordinary;

public class LowUser implements IUser {

	@Override
	public void update() {
		System.out.println("+");
	}

	@Override
	public void create() {
		try {
			throw new Exception();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete() {
		try {
			throw new Exception();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
