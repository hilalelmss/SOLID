package LiskovSubstitutionPrinciple.ordinary;

import java.util.List;

public class Hayvan {
	List<IBeslenme> hayvanlar;

	public Hayvan(List<IBeslenme> hayvanlar) {
		this.hayvanlar = hayvanlar;
	}

	public void etleBeslen() {
		for (IBeslenme iBeslenme : hayvanlar) {
			iBeslenme.etleBeslen();
		}
	}

	public void otlaBeslen() {
		for (IBeslenme iBeslenme : hayvanlar) {
			iBeslenme.otlaBeslen();
		}
	}
}
