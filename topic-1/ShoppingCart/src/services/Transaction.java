package services;

import interfaces.*;

public class Transaction implements IService {
	private String name;
	private double total;

	@Override
	public void accept(IServiceVisitor sv) {
		// TODO Auto-generated method stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
	

}
