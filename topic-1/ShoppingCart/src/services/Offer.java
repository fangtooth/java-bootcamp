package services;

import java.util.ArrayList;

import implementations.visitors.DisplayItemVisitor;
import interfaces.*;

public class Offer implements IService {
	private String name;
	private double price;
	private DisplayItemVisitor infoItemVisitor;
	private ArrayList<IItem> products;
	private ArrayList<Offer> offers;

	public Offer(String name, double price) {
		this.name = name;
		this.price = price;
		this.infoItemVisitor = new DisplayItemVisitor();
		this.products = new ArrayList<IItem>();
		this.offers = new ArrayList<Offer>();
	}

	@Override
	public void accept(IServiceVisitor sv) {
		// TODO Auto-generated method stub

	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void addItem(IItem product) {
		this.products.add(product);
	}

	public void addOffer(Offer offer) {
		this.offers.add(offer);
	}

	public void displayInformationAboutItems() {
		for (IItem item : products) {
			item.accept(infoItemVisitor);
		}
	}

	public void displayInformationAboutOffer() {
		System.out.println(this.name + "..... $" + this.price);
		// displayInformationAboutItems();
		for (Offer offer : offers) {
			System.out.println(offer.getName() + "..... $" + offer.getPrice());
			offer.displayInformationAboutItems();
		}
	}

}
