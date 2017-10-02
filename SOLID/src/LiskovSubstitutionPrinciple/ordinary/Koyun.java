package LiskovSubstitutionPrinciple.ordinary;

public class Koyun implements IBeslenme {

	@Override
	public boolean etleBeslen() {
		System.out.print("et yemez ");
		return false;
	}

	@Override
	public boolean otlaBeslen() {
		System.out.println("otla beslenir");
		return true;
	}

}
