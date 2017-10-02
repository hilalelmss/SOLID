package LiskovSubstitutionPrinciple.edited;

import java.util.List;

public class Hayvan {
	List<IEtleBeslen> etcil;
	List<IOtlaBeslen> otcul;

	public Hayvan(List<IEtleBeslen> etcil, List<IOtlaBeslen> otcul) {
		this.etcil = etcil;
		this.otcul = otcul;
	}

	public void etleBeslen() {
		for (IEtleBeslen iEtleBeslen : etcil) {
			iEtleBeslen.etleBeslenen();
		}
	}

	public void otlaBeslen() {
		for (IOtlaBeslen iOtlaBeslen : otcul) {
			iOtlaBeslen.otlaBeslenen();
		}
	}
}
