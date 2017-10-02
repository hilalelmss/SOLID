package LiskovSubstitutionPrinciple.ordinary;

public class Aslan implements IBeslenme {

	@Override
	public boolean etleBeslen() {
		System.out.print("Aslan etle beslenir");
		return true;
	}

	@Override
	public boolean otlaBeslen() {
		System.out.println("otla beslenmez!!!");
		return false;
	}

}
