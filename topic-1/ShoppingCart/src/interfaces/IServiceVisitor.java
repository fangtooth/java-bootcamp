package interfaces;

import services.*;
import implementations.products.*;

public interface IServiceVisitor {
	void visitComputer(Computer computer);
	void visitTablet(Tablet tablet);
	void visitOffer(Offer offer);
	void VisitTransaction(Transaction transaction);
}
