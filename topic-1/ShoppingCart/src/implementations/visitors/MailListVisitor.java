package implementations.visitors;

import services.*;
import implementations.products.*;
import interfaces.*;

public class MailListVisitor implements IServiceVisitor {

	@Override
	public void visitComputer(Computer computer) {
		System.out.println("Manager was notified of new computer added");		
	}

	@Override
	public void visitTablet(Tablet tablet) {
		System.out.println("Manager was notified of new tablet added");		
	}

	@Override
	public void visitOffer(Offer offer) {
		System.out.println("Manager was notified of new offer added");		
	}

	@Override
	public void VisitTransaction(Transaction transaction) {
		System.out.println("Manager was notified of new transaction");
	}
	
}
