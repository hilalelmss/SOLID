package LiskovSubstitutionPrinciple.ordinary;

public class Maymun implements IBeslenme {

	@Override
	public boolean etleBeslen() {
		System.out.println("maymun etle de beslenir");
		return true;
	}

	@Override
	public boolean otlaBeslen() {
		System.out.println("otla da beslenir");
		return true;
	}

}
