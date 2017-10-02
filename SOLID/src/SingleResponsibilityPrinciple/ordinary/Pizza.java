package SingleResponsibilityPrinciple.ordinary;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
	public String cesit;
	public String ebat;
	public String fiyat;
	List<String> maList = new ArrayList<>();

	public String getCesit() {
		return cesit;
	}

	public void setCesit(String cesit) {
		this.cesit = cesit;
	}

	public String getEbat() {
		return ebat;
	}

	public void setEbat(String ebat) {
		this.ebat = ebat;
	}

	public String getFiyat() {
		return fiyat;
	}

	public void setFiyat(String fiyat) {
		this.fiyat = fiyat;
	}

	public void malzemeEkle() {
		// TODO Auto-generated method stub

	}

	public void malzemeCikar() {
		// TODO Auto-generated method stub

	}

	public List<String> malzemeListesi() {
		return maList;
	}

	public void pisir(int zaman) {
		// TODO Auto-generated method stub

	}

	public void hamurAc(String ebat) {
		// TODO Auto-generated method stub

	}

	public void fiyatHesapla() {
		// TODO Auto-generated method stub

	}

	public List<String> getMaList() {
		return maList;
	}

	public void setMaList(List<String> maList) {
		this.maList = maList;
	}

}
