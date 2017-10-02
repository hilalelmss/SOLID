package OpenClosedPrinciple.edited;

public class Daire implements ISekil {
	public double yaricap;

	@Override
	public double hesaplaAlan() {
		// TODO Auto-generated method stub
		return (Math.PI) * (Math.pow(yaricap, 2));
	}
}
