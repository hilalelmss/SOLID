package SingleResponsibilityPrinciple.edited.transactions;

import SingleResponsibilityPrinciple.edited.entity.Pizza;

public interface IPizzaIslemleri {
	public void pisir(int zaman);

	public void fiyatHesapla();

	public void hamurAc(Pizza pizza);
}
