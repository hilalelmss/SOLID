package LiskovSubstitutionPrinciple.edited;

public class Koyun implements IOtlaBeslen {

	@Override
	public boolean otlaBeslenen() {
		System.out.println("otcul");
		return true;
	}

}
