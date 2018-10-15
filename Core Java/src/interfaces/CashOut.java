package interfaces;

public class CashOut implements ReedemSection,PaymentsSection {
	public static void main(String[] args) {
		CashOut co = new CashOut();
		co.TransferToPaypal();
		PaymentsSection ps = new CashOut(); // Runtime Polymorphism
		ps.AddPayPalAccount();
	}
	
	

	@Override
	public void TransferToPaypal() {
		System.out.println("Transfered successfully");
		
	}

	@Override
	public void giftcards() {
	
		
	}



	@Override
	public void AddPayPalAccount() {
		System.out.println("Paypal Linked successdully");
	
	}



	@Override
	public void ReedemBeerchip() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void VerifyAvailableBeerChip() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void CheckReedemed() {
		// TODO Auto-generated method stub
		
	}



}
