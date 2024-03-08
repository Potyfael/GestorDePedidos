package entities;

import java.util.Date;

import entities.enums.OrderStatuss;

public class Order {
	
	private Date moment;
	private OrderStatuss status;
	
	public Order() {
		
	}

	public Order(Date moment, OrderStatuss status) {
		super();
		this.moment = moment;
		this.status = status;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatuss getStatus() {
		return status;
	}

	public void setStatus(OrderStatuss status) {
		this.status = status;
	}
	

}
