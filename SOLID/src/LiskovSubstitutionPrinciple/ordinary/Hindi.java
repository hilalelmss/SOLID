package LiskovSubstitutionPrinciple.ordinary;

public class Hindi implements IBeslenme {

	@Override
	public boolean etleBeslen() {
		System.out.print("hindi etle de beslenir ");
		return true;
	}

	@Override
	public boolean otlaBeslen() {
		System.out.print("otla da beslenir");
		return true;
	}

}
