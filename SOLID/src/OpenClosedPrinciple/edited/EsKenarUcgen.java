package OpenClosedPrinciple.edited;

public class EsKenarUcgen implements ISekil {
	public int kenar;

	@Override
	public double hesaplaAlan() {
		// TODO Auto-generated method stub
		return (kenar * kenar * (Math.pow(kenar, (1 / 3))) / 4);
	}

}
