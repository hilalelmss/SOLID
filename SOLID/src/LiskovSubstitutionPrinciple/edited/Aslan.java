package LiskovSubstitutionPrinciple.edited;

public class Aslan implements IEtleBeslen {

	@Override
	public boolean etleBeslenen() {
		System.out.println("etçil");
		return true;
	}

}
