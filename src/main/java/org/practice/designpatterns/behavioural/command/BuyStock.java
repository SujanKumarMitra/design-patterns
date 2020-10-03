package org.practice.designpatterns.behavioural.command;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-03
 */
public class BuyStock implements Order {
	private Stock stock;

	public BuyStock(Stock stock) {
		this.stock = stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

	@Override
	public void execute() {
		stock.buy();
	}

}
