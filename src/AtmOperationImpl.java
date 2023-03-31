import java.util.*;

public class AtmOperationImpl implements AtmOperationIntrf {
    
	ATM atm = new ATM();
	Map<Double,String> minismt = new HashMap<>();
	@Override
	public void viewBalance() {
		System.out.println("Available Balance is : "+atm.getBalance());
		
	}

	@Override
	public void withdrawAmount(double withdrawAmount) {
		if(withdrawAmount%500==0) {
		if(withdrawAmount<=atm.getBalance()) {
			minismt.put(withdrawAmount," Amount withdrawn");
		System.out.println(withdrawAmount+" collect the cash !!");
		atm.setBalance(atm.getBalance()-withdrawAmount);
		viewBalance();
		
	}
		else {
			System.out.println("Insufficient Balanace !!");	
		}
	}
		else {
			System.out.println("Enter Amount in multiple of 500");
		}
	}
	@Override
	public void depositAmount(double depositAmount) {
		minismt.put(depositAmount," Amount deposited");
		System.out.println(depositAmount+" deposited Successfully!!");
		atm.setBalance(atm.getBalance()+depositAmount);
		viewBalance();
		
	}

	@Override
	public void viewMiniStatement() {
		for(Map.Entry<Double, String>m:minismt.entrySet()) {
			System.out.println(m.getKey()+""+m.getValue());
		}
		
	}

	

}
