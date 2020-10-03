package org.practice.designpatterns.behavioural.command;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-10-03
 */
public class SellStock implements Order {
	private Stock stock;

	public SellStock(Stock stock) {
		this.stock = stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

	@Override
	public void execute() {
		stock.sell();
	}

}
