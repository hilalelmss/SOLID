package OpenClosedPrinciple.ordinary;

public class AlanHesapla {
	public int dikdortAlan(Dikdortgen dikdortgen) {
		return dikdortgen.genislik * dikdortgen.yukseklik;
	}

	public int ucgenAlan(EsKenarUcgen ucgen) {
		return (int) (ucgen.birinciKenar * ucgen.birinciKenar * (Math.pow(ucgen.birinciKenar, (1 / 3))) / 4);
	}

	public double daireAlan(Daire daire) {
		return (Math.PI) * (Math.pow(daire.yaricap, 2));
	}
}
